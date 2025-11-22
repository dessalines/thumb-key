#!/bin/sh
set -e

# Creating the new tag and version code
new_tag="$1"
new_version_code="$2"

# Replacing the versions in the app/build.gradle.kts
app_build_gradle="app/build.gradle.kts"
sed -i "s/versionCode = .*/versionCode = $new_version_code/" $app_build_gradle
sed -i "s/versionName = .*/versionName = \"$new_tag\"/" $app_build_gradle

# Writing to the Releases.md asset that's loaded inside the app
tmp_file="tmp_release.md"
fastlane_file="fastlane/metadata/android/en-US/changelogs/$new_version_code.txt"
assets_releases="app/src/main/assets/RELEASES.md"
git cliff --unreleased --tag "$new_tag" --output $tmp_file
prettier -w $tmp_file

cp $tmp_file $assets_releases
rm $tmp_file

# The fastlane changelog can't be long, so just link to the real one
echo "Changelog: https://github.com/dessalines/thumb-key/blob/main/RELEASES.md" >$fastlane_file

# Adding to RELEASES.md
git cliff --tag "$new_tag" --output RELEASES.md
prettier -w RELEASES.md

# Add them all to git
git add $assets_releases $fastlane_file $app_build_gradle RELEASES.md

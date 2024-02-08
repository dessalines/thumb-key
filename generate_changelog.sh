#!/bin/sh
set -e

# Creating the new tag
new_tag="$1"
last_tag=$(git describe --tags --abbrev=0)

# Writing to the Releases.md asset that's loaded inside the app
git cliff "$last_tag"..HEAD --tag "$new_tag" --output app/src/main/assets/RELEASES.md

# Prepending to the RELEASES.md
git cliff "$last_tag"..HEAD --tag "$new_tag" --prepend RELEASES.md
prettier -w RELEASES.md

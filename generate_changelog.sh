#!/bin/sh
set -e

# Creating the new tag
new_tag="$1"

# Writing to the Releases.md asset that's loaded inside the app
git cliff --unreleased --tag "$new_tag" --output app/src/main/assets/RELEASES.md

# Prepending to the RELEASES.md
git cliff --tag "$new_tag" --output RELEASES.md
prettier -w RELEASES.md app/src/main/assets/RELEASES.md

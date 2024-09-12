# Contributing to Thumb-Key

## Ways to contribute

- Add a new keyboard layout.
- Participate here and start answering questions.
- File GitHub issues for bug reports from [/c/thumbkey](https://lemmy.ml/c/thumbkey). Watch the project for duplicate reports and link them to the first report so devs can easily close dupes.
- File new bug reports for issues you find.
- Add missing translations.
- Code contributions.

## How do I add my language or layout?

I'd be happy to accept additions to add more languages, and layouts. To start:

- Read the letter position guidelines above. This means you'll likely need a letter frequency chart for text written in your language.
  - The general rule is: popular vowels on the right, bottom to top, consonants on the left.
- Copy [this file](https://github.com/dessalines/thumb-key/blob/main/app/src/main/java/com/dessalines/thumbkey/keyboards/ENThumbKey.kt), or another sample keyboard from the same folder.
  - The title of the new layout should be lowercase and follow the following format: `[languages] [base] [qualifiers]? [version]?` (see also [#702](https://github.com/dessalines/thumb-key/issues/702)).
  - Change the characters to whatever you'd like.
  - This file contains both a _shifted_, and _non-shifted_ keyboard, so make sure you take care of both.
  - You can also add or subtract columns if you want, but the layout must remain a grid. I **highly recommend** sticking with the 3x3 layout.
- Add the new keyboard to the end of [KeyboardLayout.kt file](https://github.com/dessalines/thumb-key/blob/main/app/src/main/java/com/dessalines/thumbkey/utils/KeyboardLayout.kt). If you don't know how to do this, skip to the next step.
- Either open a pull request, or an issue, linking your new keyboard file. I'll handle the rest of the work.
- If opening a pull request, run `./gradlew formatKotlin` to format the code correctly.

## Theming guide

To add a custom theme:

- Use google's [Material 3 custom theme generator](https://m3.material.io/theme-builder#/custom), and save your `Theme.kt` file.
- Copy the theme into `Color.kt` like the others.
- Add the theme to the `ThemeColor` enum in `Types.kt`
- Add a translation string in `strings.xml` for your theme name.
- Add the theme to the `colorPairs` in `Theme.kt`

If you want to tweak your theme more precisely, these are the colours
that are used. Please keep the theme in line with [Material Design
Guidelines](https://m3.material.io/styles/color/system/overview)
where feasibe.

| Coloured element                          | Material colour used          |
| ----------------------------------------- | ----------------------------- |
| Normal key background                     | `surface`                     |
| Special key (space, emoji etc) background | `surfaceVariant`              |
| Main key colour                           | `primary`                     |
| Key animated after press                  | `tertiary`                    |
| Swipe letter colour                       | `secondary`                   |
| Swipe symbol colour                       | `secondary`, but at 50% alpha |
| Keypress flash colour on tap/hold         | `inversePrimary`              |
| Keypress flash colour on release          | `tertiaryContainer`           |
| Key outline                               | `outline`                     |
| Backdrop                                  | `background`                  |

## Application structure

- Basic [Modern Android Development](https://developer.android.com/series/mad-skills) tech stack (Compose, Navigation, Coroutines, AndroidX)
- Guide to [App Architecture](https://developer.android.com/topic/architecture), without domain layer. Basically, MVVM + Repositories for data access.

## Code contributions

You can open Thumb-Key in AndroidStudio, version 2022.3.1 or later (Giraffe).

Use Java 11+, preferably Java 17

### Kotlin

This project is full Kotlin. Please do not write Java classes.

### Code quality

The code must be formatted to a [common standard](https://pinterest.github.io/ktlint/0.49.1/rules/standard/).

To check for violations

```shell
./gradlew lintKotlin
```

Or just run this to fix them

```shell
./gradlew formatKotlin
```

Markdown and yaml files are formatted according to prettier.

You can install prettier either through the plugin, or globally using npm `npm install -g prettier`

To check for violations

```shell
prettier -c "*.md" "*.yml"
```

To fix the violations

```shell
prettier --write "*.md" "*.yml"
```

## Adding translations

You can find the translations in the `app/src/main/res/values-{locale}/strings.xml` file.
You can open it in android studio, right click and click open translations editor or you can
directly edit the files.

If you add a new locale. Also add it in `locales_config.xml`. Don't forget to escape `'` in translations.

## Theming guide

To add a custom theme:

- Use google's [Material 3 custom theme generator](https://m3.material.io/theme-builder#/custom), and save your `Theme.kt` file.
- Copy the theme into `Color.kt` like the others.
- Add the theme to the `ThemeColor` enum in `Types.kt`
- Add a translation string in `strings.xml` for your theme name.
- Add the theme to the `colorPairs` in `Theme.kt`

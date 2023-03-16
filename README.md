<div align="center">

![GitHub tag (latest SemVer)](https://img.shields.io/github/tag/dessalines/thumb-key.svg)
[![GitHub issues](https://img.shields.io/github/issues-raw/dessalines/thumb-key.svg)](https://github.com/dessalines/thumb-key/issues)
[![License](https://img.shields.io/github/license/dessalines/thumb-key.svg)](LICENSE)
![GitHub stars](https://img.shields.io/github/stars/dessalines/thumb-key?style=social)

</div>

<p align="center">
  <a href="https://github.com/dessalines/thumb-key" rel="noopener">
 <img width=200px height=200px src="https://i.postimg.cc/RZjZGzFG/Screenshot-2023-03-16-00-14-28-039-edit-app-olaunchercf.jpg"></a>

 <h3 align="center"><a href="https://github.com/dessalines/thumb-key">Thumb-Key</a></h3>
  <p align="center">
    A privacy-conscious keyboard made for your thumbs
    <br />
    <br />
    <a href="https://github.com/dessalines/thumb-key/issues">Report Bug</a>
    ·
    <a href="https://github.com/dessalines/thumb-key/issues">Request Feature</a>
    ·
    <a href="https://github.com/dessalines/thumb-key/blob/main/RELEASES.md">Releases</a>
  </p>
  <p align="center">
    <!-- <a href="https://f-droid.org/packages/com.dessalines.thumbkey"><img src="https://fdroid.gitlab.io/artwork/badge/get-it-on.png" alt="Get it on F-Droid" height="80"></a> -->
    <!-- <a href="https://play.google.com/store/apps/details?id=com.dessalines.thumbkey"><img src="https://cdn.rawgit.com/steverichey/google-play-badge-svg/master/img/en_get.svg" height="80"></a> -->
    <a href="https://github.com/dessalines/thumb-key/releases/latest"><img src="https://raw.githubusercontent.com/andOTP/andOTP/master/assets/badges/get-it-on-github.png" height="80"></a>
  </p>
</p>

## About Thumb-Key

Thumb-Key is a _privacy-conscious_ smart keyboard, made specifically for your thumbs.

It features a **3x3 grid layout**, as many older phones had, and uses swipes for the less common letters. Initial testing shows that you can reach ~25 words per minute after a day of use.

Instead of relying on big-data-driven, privacy-offending word and sentence prediction for accuracy, as do most popular smartphone keyboards like Gboard and Swiftkey, Thumb-Key uses **large keys with predictable positions**, to prevent your eyes from [hunting and pecking](https://www.keyboardingonline.com/hunting-and-pecking/) for letters.

As the key positions get ingrained into your muscle memory, eventually you'll be able to appromixate the fast speeds of [touch-typing](https://en.m.wikipedia.org/wiki/Touch_typing), your eyes never having to leave the text edit area.

This project is a follow-up to the now unmaintained (and closed-source) [MessageEase Keyboard](https://www.exideas.com/ME/), which is its main inspiration.

## User Guide

Tap a key, or slide to type a letter.

<img width=200px height=200px src="https://i.postimg.cc/7hSF2nMN/In-Shot-20230316-091452080.gif">

Double tap the space bar to type a period.

<img width=200px height=200px src="https://i.postimg.cc/LXkdqVV3/In-Shot-20230316-091704600.gif">

Slide left on the backspace key to delete whole words.

<img width=200px height=200px src="https://i.postimg.cc/d1YpKyKk/In-Shot-20230316-091739029.gif">

### Other hints

- Press the `#` key to see a numeric keypad, and additional symbols.
- Press the Settings Gear key to configure Thumb-Key.

## Design

### History

Physical keyboards, with the full-size _QWERTY_ layout, **were not designed for use on small devices like phones**; they were designed specifically for 10 fingers resting on a keybed, sitting on a secure surface.

Phones must be held with the fore-fingers and palm, leaving only 2 thumbs (as opposed to 10 fingers) free to perform key-presses.

As texting came into being, word prediction came to be seen as the only solution to slow input. On phones that used the 12-key numeric layout, [T9 predictive text](<https://en.m.wikipedia.org/wiki/T9_(predictive_text)>) was used. Other phones used the full-hand layout with the familiar _QWERTY_ layout from the 1800s.

#### When keyboards became Keyloggers

As phones moved from physical buttons to soft-keyboards, key sizes became smaller and taps more imprecise, with better predictive technology picking up the slack. These solutions still could not avoid the hunt-and-peck problem.

Smartphone companies like Apple and Google, in an attempt to better their word prediction algorithms, began submitting and aggregating all their user's key-taps to their servers, violating user's privacy in the process. [Known as Keyloggers](https://usa.kaspersky.com/resource-center/definitions/keylogger) on desktop computers, and seen as universally malicious programs, these apps unfortunately became normalized, and seen as a necessity on smartphones.

As of today, smartphone keyboards are in such a terrible state of privacy, that there aren't many keyboards left that can guarantee **not to be logging all of your keystrokes.**

#### MessageEase

One company named Exideas created a keyboard app called [MessageEase](https://www.exideas.com/ME/), which relied on the original large 9-key grid of old phones, and managed to acheive comparable typing speeds to other keyboards, without relying on big-data-powered word-prediction.

[Much research went into MessageEase's design](https://www.exideas.com/ME/ICMI2003Paper.pdf), and many of its users can do > 50 words per minute.

MessageEase is unfortunately unmaintained, and Thumb-Key uses a better alternating-thumb layout letter position (although the original MessageEase Keyboard layout is available in the settings.)

### Thumb-Key Letter Position

- Large keys are in a predictable 9-key grid. Eventually, like touch-typing, you should be able to keep your eyes on the text input area, rather than hunting-and-pecking for letters.
- Letter positions are based on [English text letter frequency](https://en.m.wikipedia.org/wiki/Letter_frequency). The most common letters are: **ETAOINSHRDLC**
- First 9 letters by frequency are the 9 center keys. The next 8 are swipes to the center. The next 8 are on the center hub key. Z is last.
- Alternating fingers for vowels and consonants (Vowels on right side of keyboard).
- Prioritize bottom keys, and right side of keyboard. So EAO should be on the right side, and bottom to top, while TNS is on the left side.
- Alternating fingers for common digrams.

### Built With

- [Android Jetpack Compose](https://developer.android.com/jetpack/compose)

## Features

- Highly configurable.
- Customizeable sizing, ThumbKey and MessageEase layouts, dynamic / Material v3 themes, animations, haptic feedback, and audio feedback.
- Open source, [AGPL License](/LICENSE).

## Installation / Releases

- [Releases](https://github.com/dessalines/thumb-key/releases)
<!-- - [F-Droid](https://f-droid.org/en/packages/com.dessalines.thumbkey/) -->

## Support / Donate

Thumb-Key will always remain free, open-source software. We've seen many keyboards (and open-source projects in general) go unmaintained after a few years. **Recurring donations have proven to be the only way these projects can stay alive.**

Your donations directly support full-time development, and help keep this maintained. If you find yourself using Thumb-Key every day, consider donating:

- [Support me on Liberapay](https://liberapay.com/dessalines).
- [Support me Patreon](https://www.patreon.com/dessalines).

### Crypto

- bitcoin: `1Hefs7miXS5ff5Ck5xvmjKjXf5242KzRtK`
- ethereum: `0x400c96c96acbC6E7B3B43B1dc1BB446540a88A01`
- monero: `41taVyY6e1xApqKyMVDRVxJ76sPkfZhALLTjRvVKpaAh2pBd4wv9RgYj1tSPrx8wc6iE1uWUfjtQdTmTy2FGMeChGVKPQuV`
- cardano: `addr1q858t89l2ym6xmrugjs0af9cslfwvnvsh2xxp6x4dcez7pf5tushkp4wl7zxfhm2djp6gq60dk4cmc7seaza5p3slx0sakjutm`

## Contact

- [Thumbkey dev chat](https://matrix.to/#/#thumbkey-dev:matrix.org)
- [Mastodon](https://mastodon.social/@dessalines)

## Android IME Resources

- https://github.com/THEAccess/compose-keyboard-ime
- https://stackoverflow.com/questions/65570024/build-software-keyboard-with-jetpack-compose-ime-input-method-with-jetpack-com
- https://developer.android.com/develop/ui/views/touch-and-input/creating-input-method

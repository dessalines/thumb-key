{
  description = "thumb-key build environment";

  inputs = {

    nixpkgs.url = "github:NixOS/nixpkgs/nixos-unstable";

    android-nixpkgs = {
      url = "github:tadfisher/android-nixpkgs";
      inputs.nixpkgs.follows = "nixpkgs";
    };


  };

  outputs = { self, nixpkgs, android-nixpkgs }:
    let
      system = "x86_64-linux";
      pkgs = import nixpkgs {
        inherit system;
        config.allowUnfree = true;
      };

      android-sdk = android-nixpkgs.sdk.${system} (sdkPkgs: with sdkPkgs; [
        cmdline-tools-latest
        build-tools-33-0-1
        platform-tools
        platforms-android-34
        emulator
      ]);

    in
    rec {

      devShells."x86_64-linux".default = pkgs.mkShell {
        buildInputs = [
          pkgs.android-studio
          pkgs.jdk11
          android-sdk
        ];
        GRADLE_OPTS = "-Dorg.gradle.project.android.aapt2FromMavenOverride=${android-sdk}/share/android-sdk/build-tools/33.0.0/aapt2";
        ANDROID_SDK_ROOT = "${android-sdk}/share/android-sdk";
        ANDROID_HOME = "${android-sdk}/share/android-sdk";
        JAVA_HOME = pkgs.jdk11;
      };

    };
}

# I18n Translate Pro JVM Plugin Demo

This is a demo project to showcase the [I18n Translate Pro JVM](https://plugins.jetbrains.com/plugin/27856-i18n-translate-pro-jvm) plugin for JetBrains IDEs.

## Project Overview

This Spring Boot application demonstrates internationalization (i18n) features with multiple language support including:
- English (default)
- Hindi
- Japanese
- Malay
- Chinese

## Features

- Multi-language message properties files
- Spring Boot application with i18n configuration
- Example translations in different languages

## Plugin Benefits

The I18n Translate Pro JVM plugin helps developers:
- Translate message keys automatically
- Manage multiple language files efficiently
- Streamline the internationalization workflow

## Getting Started

1. Build the project: `./gradlew build`
2. Run the application: `./gradlew bootRun`
3. Install the I18n Translate Pro JVM plugin in your JetBrains IDE
4. Open the project and explore the translation features

## Message Files

The project includes message properties files located in `src/main/resources/i18n/`:
- `messages.properties` (English)
- `messages_hi.properties` (Hindi)
- `messages_ja_JP.properties` (Japanese)
- `messages_ms_MY.properties` (Malay)
- `messages_zh.properties` (Chinese)
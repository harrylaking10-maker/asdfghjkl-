# MC 1.21.11 Plugin Project

This is a Minecraft Paper plugin project configured for Java 21 compilation.

## Building

Run the following command to build your plugin:

```bash
./gradlew shadowJar
```

The compiled JAR will be located in `build/libs/MyPlugin.jar`.

## Installation

1. Place the JAR file in your server's `plugins/` folder
2. Restart your server
3. Your plugin will be loaded automatically

## Development

Edit `src/main/java/com/example/MyPlugin.java` to add your plugin logic.

# HTML5 Desktop App
This is an example of a desktop application wirtten with Kotlin and HTML5.

This app makes use of [TornadoFX](https://github.com/edvin/tornadofx) lightweight framework to create a JavaFX window with WebView.

![App screenshot](screenshots/screenshot-1.png?raw=true "App screenshot")

## Usage
Download a jar file from this repo [Github Releases](https://github.com/lorenzo-ange/html5-desktop-app/releases).

Start the app with: (Java 8 required)
```bash
java -jar html5-desktop-app-0.1-all.jar
```

## Build from source
Download the repo:
```bash
git clone https://github.com/lorenzo-ange/html5-desktop-app
cd html5-desktop-app
```

Run the app:
```bash
./gradlew run
```

Package a redistributable fat jar:
 ```bash
 ./gradlew shadowJar
 ```
 You can find the jar file at `APP_DIR/build/libs/html5-desktop-app-0.1-all.jar`
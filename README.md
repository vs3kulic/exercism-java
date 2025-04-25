# Java Exercises

This repository contains solutions to various Java exercises from the Exercism platform. Each exercise is organized into its own directory, with separate folders for source code, tests, and configuration files!

## Structure

Each exercise folder contains:
- `src/main/java`: Main source code
- `src/test/java`: Unit tests
- `build.gradle`: Gradle build configuration
- Guidance files (`HELP.md`, `HINTS.md`, `README.md`)

## Exercises

### 1. Annalyn's Infiltration  
Implement boolean logic for rescue scenarios.  
[Details](annalyns-infiltration/README.md)

### 2. Lasagna  
Calculate cooking times for lasagna preparation.  
[Details](lasagna/README.md)

### 3. Log Levels  
Process and reformat log messages.  
[Details](log-levels/README.md)

## Running Tests

Each exercise uses Gradle. To test:

1. Navigate to the exercise:
   ```bash
   cd <exercise-folder>
   ```

2. Run tests:
   ```
   # Unix/macOS/Linux
   ./gradlew test

   # Windows
   gradlew.bat test
   ```

**Example**:
```
cd lasagna
./gradlew test
```

### Test Reports
View HTML reports at:  
`<exercise-folder>/build/reports/tests/test/index.html`

### Common Commands
- `./gradlew clean` : Remove build files
- `./gradlew build` : Compile & test
- `./gradlew check` : Run tests only

---

🎯 **Pro Tip**: Start with `Lasagna` for basic syntax practice. Check each exercise's README for tailored hints!  
☕ **Java Version**: Requires JDK 17+ (recommend [Temurin 17](https://adoptium.net/))

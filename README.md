# GuessTheNumberApp 🎲

**GuessTheNumberApp** is a simple Android app where users try to guess a randomly generated number between 1 and 100. The app gives instant feedback on guesses and allows users to reset the game at any time.

---

## Features

- Generates a random number between 1 and 100.
- Allows users to input their guess using an **EditText**.
- Provides instant feedback:

  - "Too low" if the guess is lower than the number.
  - "Too high" if the guess is higher than the number.
  - "Correct" if the guess matches the number.

- Reset button to start a new game.
- User-friendly interface with:

  - **Toast messages** for quick feedback.
  - **TextView** to display the result.

---

## Screenshots

<img src="/public/p1.png" alt="drawing" width="300"/>
<img src="/public/p2.png" alt="drawing" width="300"/>
<img src="/public/p3.png" alt="drawing" width="300"/>
<img src="/public/p4.png" alt="drawing" width="300"/>
<img src="/public/p5.png" alt="drawing" width="300"/>

---

## How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/ashweshashrestha/GuessTheNumberApp.git
   ```

2. Open the project in **Android Studio**.
3. Let Android Studio download all required dependencies.
4. Connect an Android device or start an emulator.
5. Run the app: **Run > Run 'app'**.

---

## Technologies Used

- **Java** (Android SDK)
- **Android Studio**
- **XML** (for layout)

---

## Project Structure

```
GuessTheNumberApp/
│
├── app/
│   ├── src/main/java/com/example/guessthenumber/MainActivity.java
│   ├── src/main/res/layout/activity_main.xml
│   └── ...
├── build.gradle
└── README.md
```

---

## Future Improvements

- Add a counter for the number of guesses.
- Highlight previous guesses.
- Add sound or animation for correct guess.
- Support multiple difficulty levels.

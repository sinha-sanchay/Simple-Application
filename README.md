# Adventure Game

## Overview
This is a simple adventure game project implemented in Java. The game allows players to explore a virtual world, interact with objects, and engage in combat.

## Project Structure
```
adventure-game
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── AdventureGame.java
│   │   │   ├── Game.java
│   │   │   └── Player.java
│   │   └── resources
│   │       └── game.properties
├── .gitignore
├── build.gradle
└── README.md
```

## Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Gradle 6.0 or higher

### Installation
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd adventure-game
   ```

### Running the Game
1. Build the project using Gradle:
   ```
   ./gradlew build
   ```
2. Run the game:
   ```
   java -cp build/libs/adventure-game.jar AdventureGame
   ```

## Game Features
- Player movement and actions
- Combat system
- Game state management

## Configuration
Game settings and messages can be configured in the `src/main/resources/game.properties` file.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

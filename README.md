# Android Notes App
A simple Notes application built using Kotlin, Jetpack Compose, and Room Database.
## Features
- Add new notes
- Add title and content
- Display notes in a list
- Material 3 UI
- Local persistence using Room Database
- Notes remain saved after restarting the app
## Technologies Used
- Kotlin
- Jetpack Compose
- Material 3
- Room Database
- MVVM Architecture
- Android Studio
## Project Structure
- `MainActivity.kt` - Main application UI
- `Note.kt` - Note database entity
- `NoteDao.kt` - Database operations
- `NoteDatabase.kt` - Room database
- `NoteRepository.kt` - Repository layer
- `NotesViewModel.kt` - Application logic and state
- `NotesViewModelFactory.kt` - ViewModel factory

## How to Run

1. Clone this repository.
2. Open the project in Android Studio.
3. Sync the Gradle files.
4. Start an Android emulator or connect an Android device.
5. Run the application.

## Future Improvements

- Search notes
- Edit notes
- Delete notes
- Add timestamps
- Add categories
- Cloud synchronization

## Screenshots
### Main Screen
![Main Screen]<img width="1752" height="886" alt="front" src="https://github.com/user-attachments/assets/cafdc794-a798-4cf8-8115-950ec4aa4cd1" />
### Add Note
![Add Note]<img width="1752" height="877" alt="image" src="https://github.com/user-attachments/assets/addf88f5-79f4-4f21-9629-f43be402e01a" />
### Room Persistence
![Room Persistence]<img width="1626" height="837" alt="image" src="https://github.com/user-attachments/assets/1ada8342-d504-43f1-9c25-be0aeb18bfd1" />


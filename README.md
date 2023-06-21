# Meow - The Cat Picture App

Meow is a delightful Android application that allows users to browse and explore a vast collection of cat pictures. With Meow, you can discover various cat breeds, view their captivating images, and even filter cats based on specific breeds.

## Features

- **Cat Picture Gallery**: Browse through a stunning collection of cat pictures and enjoy the cuteness overload!
- **Breed Information**: Each cat picture is accompanied by details about the cat's breed, giving you insights into the feline world.
- **Breed Filtering**: Use the built-in filter functionality to narrow down the cat pictures and focus on your favorite breeds.

## Technology Stack

Meow is built using the latest Android development technologies and follows modern software architecture and design principles. The key components used in the app's development are:

- **Architecture**: MVVM (Model-View-ViewModel) architecture, which separates the UI and business logic, resulting in clean and maintainable code.
- **Networking**: Retrofit, a popular HTTP client library for Android, is utilized for seamless communication with thecatapi and fetching the cat picture data.
- **Dependency Injection**: Dagger Hilt, a powerful dependency injection framework, simplifies the management and injection of dependencies throughout the app.
- **Image Loading**: Glide, a fast and efficient image loading library, is employed to display the cat pictures in a smooth and optimized manner.
- **Pagination**: Android Paging Library enables efficient loading of cat pictures by handling data pagination and providing a seamless scrolling experience.
- **Concurrency**: Kotlin Coroutines, a powerful asynchronous programming framework, ensures efficient and responsive handling of concurrent operations within the app.
- **Navigation**: Android Navigation Component is integrated to handle navigation between different screens and provide a seamless user experience.
- **Error Handling**: The app gracefully handles various errors, including network failures and no internet connection scenarios, to provide a robust user experience.
- **Splash Screen**: A visually appealing splash screen is added to enhance the app's launch experience.
- **Extension Functions**: Kotlin extension functions are utilized to simplify and enhance the readability of the codebase.
- **Shimmer Effect**: A shimmer effect is applied during data loading to provide visual feedback and improve the perceived performance of the app.
- **Security**: ProGuard rules are implemented to obfuscate the code and protect sensitive information, ensuring the security of the app.
- **Unit Tests**: Unit tests are written for ViewModel and Repository to ensure the correctness and robustness of the app's core functionalities.

## Getting Started

To get started with Meow and explore the world of adorable cat pictures, follow these steps:

1. Clone the repository:

```shell
git clone https://github.com/your-username/meow-app.git

2. Open the project in Android Studio.

3. For getting breeds along with picture, generate API key from [TheCatAPI](https://thecatapi.com/) and place inside res -> utils -> AppConstants.kt -> API_KEY = "place your key here"
    
4. Build and run the app on an Android device or emulator.


## Running Unit Tests

To run the unit tests for the ViewModel and Repository, you can follow these steps:

Open the project in Android Studio.

1. Navigate to the respective test classes for the ViewModel and Repository.

2 .Right-click on the test class or specific test method and click on "Run" or use the keyboard shortcut to execute the tests.

3. View the test results in the "Run" or "Debug" tool window to ensure that all tests pass successfully.

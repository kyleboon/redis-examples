# Building Redis Examples using Gradle Wrapper

## Prerequisites

Before proceeding, make sure you have the following prerequisites installed on your system:

1. **Java Development Kit (JDK):**
   - Ensure you have a JDK (Java Development Kit) installed on your system. If not, follow the instructions below to download and install the JDK.

## Downloading and Installing JDK

### Windows:

1. **Visit the Oracle JDK download page:**
   - Open your web browser and go to the Oracle JDK download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Accept the License Agreement:**
   - Accept the license agreement and choose the appropriate JDK version for your system.

3. **Download the JDK installer:**
   - Download the JDK installer for Windows.

4. **Run the Installer:**
   - Run the downloaded installer and follow the installation wizard's instructions.

5. **Verify Installation:**
   - Open a command prompt and run `java -version` to verify that the JDK is installed correctly.

### macOS:

1. **Visit the Oracle JDK download page:**
   - Open your web browser and go to the Oracle JDK download page: [Oracle JDK Downloads](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Accept the License Agreement:**
   - Accept the license agreement and choose the appropriate JDK version for your system.

3. **Download the JDK installer:**
   - Download the JDK installer for macOS.

4. **Run the Installer:**
   - Run the downloaded installer and follow the installation instructions.

5. **Verify Installation:**
   - Open a terminal and run `java -version` to verify that the JDK is installed correctly.

### Linux (Ubuntu):

1. **Update Package List:**
   - Open a terminal and run `sudo apt update` to update the package list.

2. **Install OpenJDK:**
   - Install OpenJDK using the following command: `sudo apt install default-jdk`

3. **Verify Installation:**
   - Run `java -version` in the terminal to verify that the JDK is installed correctly.

## Building the Redis examples using Gradle

To build using the Gradle Wrapper:

1. **Clone the Repository:**
   - Clone the repository using `git clone` or set up a new Java project.

2. **Navigate to the Project Directory:**
   - Open a terminal and navigate to the root directory the repository.

3. **Run the Gradle Wrapper:**
   - Use the Gradle Wrapper script to build your application: `./gradlew build` (on Unix-based systems) or `gradlew.bat build` (on Windows).

4. **Gradle Build:**
   - Gradle will download the necessary dependencies, compile the Java source code, and generate the application artifacts.

5. **Application Output:**
   - After a successful build, the compiled application artifacts will be available in the `build` directory.


# CMake Troubleshooting and Basic Build Procedure

## 1. Cleaning Previous Build Files

If you've already run CMake and need to switch generators (e.g., from Visual Studio to MinGW), you'll need to clean up the old build files:

### Command Prompt:
```bash
del CMakeCache.txt
rmdir /s /q CMakeFiles
```

### PowerShell:
```powershell
Remove-Item CMakeCache.txt -Force
Remove-Item -Recurse -Force CMakeFiles
```

This removes the cached build settings and allows you to use a new generator.

## 2. Running CMake to Generate Build Files

Once you’ve cleaned up, run CMake to generate the necessary build files:

### For Visual Studio (default on Windows):
```bash
cmake -G "Visual Studio 17 2022" ..
```

This generates project files for Visual Studio.

### For MinGW Makefiles:
```bash
cmake -G "MinGW Makefiles" ..
```

This generates Makefiles for MinGW.

## 3. Building the Project

Once the build files are generated, you can build the project:

### For Visual Studio:
Use the default `cmake --build` command, which will use MSBuild under the hood:
```bash
cmake --build .
```

### For MinGW:
Use the `mingw32-make` command:
```bash
mingw32-make
```

## 4. Locating the Executable

After building, the executable file is typically placed in one of these locations:
- **For Visual Studio**: `the_build/Debug/e1.exe`
- **For MinGW**: `the_build/e1.exe`

## 5. Common Errors

### Error: `Could not create named generator MinGW Makefiles`
This happens if CMake has already generated build files for a different generator (e.g., Visual Studio). Clean the build files by following step 1 and re-run CMake with the correct generator.

### Error: `Error: could not load cache`
This occurs when CMake cannot find or read `CMakeCache.txt`. If the file exists but is corrupted or from a previous build, remove it by following step 1.

## 6. Example Project Structure

Here is an example of a basic project using CMake:

```
project_root/
│   CMakeLists.txt  # Defines the project and build settings
│
└───src/
    │   main.c       # Main program file
    │   example.c    # Example function implementation
    └───example.h    # Header for example.c
```

### CMakeLists.txt Example:
```cmake
cmake_minimum_required(VERSION 3.29)
project(e1)

set(CMAKE_C_STANDARD 99)

add_executable(e1 main.c example.c)
```

## 7. Running the Executable

Once built, navigate to the folder containing the `.exe` file (e.g., `the_build/Debug/` or `the_build/`) and run it:
```bash
./e1.exe
```

## 8. Additional Resources

- [CMake Documentation](https://cmake.org/documentation)
- [MinGW Documentation](http://www.mingw.org/wiki/Getting_Started)

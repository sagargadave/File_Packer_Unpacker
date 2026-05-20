# File Packer Unpacker

A desktop-based Java application used to pack multiple files into a single packed file and unpack them back using custom file handling logic and Java Swing GUI.

---

# Features

- Pack multiple files into one file
- Unpack files easily
- Java Swing based GUI
- Custom packing format
- Simple and lightweight
- Fast file extraction

---

# Technologies Used

- Java
- Java Swing
- File Handling
- OOP Concepts

---

# Project Structure

```bash
Packer-Unpacker/
│
├── Main.java
├── Packer.java
├── Unpack.java
├── PackFront.java
├── UnpackFront.java
├── NextPage.java
│
├── Demo/
│
├── PackedFile.pack
│
└── Unpacked/
```

---

# How It Works

## Packing Process

1. Select folder/files
2. Read file data
3. Create custom header
4. Merge all files into one packed file

## Unpacking Process

1. Read packed file
2. Verify magic number
3. Read file headers
4. Extract original files

---

# Compilation

```bash
javac *.java
```

---

# Run Project

```bash
java Main
```

---
# After Running

Main window will open with two buttons:

- Pack Files
- Unpack Files

---

## Packing Files

1. Click on **Pack Files**
2. Enter folder name/path
3. Enter output packed file name

Example:

```bash
Folder Name : Demo
Output File : PackedFile.pack
```

4. Click on **PACK**
5. Packed file will be created successfully

---

## Unpacking Files

1. Click on **Unpack Files**
2. Enter packed file name

Example:

```bash
PackedFile.pack
```

3. Click on **UNPACK**
4. Extracted files will be stored inside:
```bash
Unpacked/
```


# LibrarySystem
📚 Library System

A simple Java-based Library System that allows members to borrow and return books using Encapsulation.

🚀 Features

Add books with title, author, and availability status.

Issue a book to a member.

Return a book to make it available for others.

Prevent issuing a book if it's already borrowed.

🏗️ Project Structure

LibrarySystem/
│── src/
│   ├── models/
│   │   ├── Book.java
│   │   ├── Member.java
│   ├── Main.java

🛠️ Technologies Used

Java (OOP Concepts)

Encapsulation (Private attributes, Getter methods)

📂 Class Overview

📖 Book.java

Attributes: title, author, available

Methods:

issueBook(): Marks the book as unavailable.

returnBook(): Marks the book as available.

isAvailable(): Returns the availability status.

👤 Member.java

Attributes: name

Methods:

borrowBook(Book): Issues a book.

returnBook(Book): Returns a book.

🎯 Main.java

Driver class to test the library system.

🔧 Installation & Usage

1️⃣ Clone the Repository

git clone https://github.com/vivekglbajaj/LibrarySystem.git
cd LibrarySystem/src

2️⃣ Compile and Run

javac models/Book.java models/Member.java Main.java
java Main

🤝 Contributing

Feel free to fork the repo, create a feature branch, and submit a PR.

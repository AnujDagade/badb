# Badb

[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)
[![Version](https://img.shields.io/badge/version-0.1.0-blue.svg)](https://semver.org/)
[![Status](https://img.shields.io/badge/status-experimental-orange.svg)]()

**Badb** is an educational database implementation project designed to myself learn about data structures, algorithms, and database internals.

## 🎯 Project Goals

BadDB aims to provide a hands-on way to understand:

- **Data Structure Implementation**: Binary search trees, hash tables, and other fundamental structures
- **Database Fundamentals**: Indexing, querying, and data persistence
- **Performance Optimization**: Understanding time and space complexity tradeoffs
- **Database Internals**: Storage engines, query processing, and transaction management
- **Linux**: More about linux eg File handling,users, groups, permissions etc.

## 🧪 Features

BadDB is currently in the early stages of development with the following features:

- **Binary Search Tree**: Core storage mechanism for key-value pairs
- **Basic Operations**: Insert, retrieve,search
- **In-memory Storage**: All data is currently stored in memory

## 🚀 Getting Started

### Prerequisites

- Java JDK 11 or higher
- Maven for dependency management

### Installation

Clone the repository:

```shell script
git clone https://github.com/yourusername/baddb.git
cd baddb
```


Build the project:

```shell script
mvn clean install
```


### Basic Usage

Here's a simple example of using BadDB:

```java
// Create a new BadDB instance
BinarySearchTree baddb = new BinarySearchTree();

// Insert some data
baddb.insertData(1L, "Hello");
baddb.insertData(42L, "World");
baddb.insertData(100L, "BadDB");

// Retrieve data
Node result = baddb.getData(42L);
System.out.println(result.getValue());  // Outputs: World

// Update data
baddb.updateData(42L, "Updated Value");

// Delete data
baddb.deleteData(1L);
```


## 🗺️ Roadmap

- [ ] Add persistence layer
- [ ] Implement hash-based indexing for faster lookups
- [ ] Add basic transaction support
- [ ] Create a simple query language
- [ ] Support concurrent operations with locking
- [ ] Implement B-Tree based storage engine


## 💡 Implementation Notes

BadDB deliberately implements data structures from scratch rather than using Java's built-in collections. This approach is chosen for educational purposes to deeply understand the mechanics of these structures.

### Current Implementation:

- **Binary Search Tree**: Used for storing and retrieving key-value pairs
- **Node Structure**: Contains key (Long), value (Object), and references to left and right children

### Performance Considerations:

- The current BST implementation is not balanced, which could lead to O(n) operations in worst-case scenarios
- No concurrency control is implemented yet
- Memory usage is not optimized

## 👨‍💻 Contributing

Contributions are welcome! This is a learning project, so feel free to:

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📝 License

Distributed under the MIT License. See `LICENSE` for more information.

## ⚠️ Disclaimer

BadDB is named such for a reason! It's a learning tool, not a production database. It may lose your data, perform poorly, or have significant bugs. Use it to learn about database internals, not to store anything important.

---

*"The only truly bad database is the one where you didn't learn anything."*

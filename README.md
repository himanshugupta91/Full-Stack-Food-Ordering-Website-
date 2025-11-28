# 🍔 Food Ordering System - Full Stack Project

Welcome to the **Food Ordering System**, a comprehensive full-stack application designed to provide a seamless food delivery experience. This repository contains both the robust Spring Boot backend and the modern React frontend.

## 🚀 Project Overview

This system is designed to handle the entire lifecycle of online food ordering, from browsing menus and placing orders to payment processing and delivery management. It features distinct portals for Customers, Restaurant Owners, and Administrators.

### 🏗️ Architecture

The project is divided into two main components:

1.  **Backend (`backend-spring boot`)**: A RESTful API built with Spring Boot, handling business logic, data persistence, and security.
2.  **Frontend (`frontend-react`)**: A responsive Single Page Application (SPA) built with React, consuming the backend APIs to provide an interactive user interface.

## 🛠️ Tech Stack

### Backend
-   **Language**: Java 17
-   **Framework**: Spring Boot 3.1.3
-   **Database**: MySQL
-   **Security**: Spring Security, JWT
-   **Payments**: Stripe API

### Frontend
-   **Framework**: React 18
-   **UI Library**: Material UI (MUI), Tailwind CSS
-   **State Management**: Redux
-   **Routing**: React Router DOM

## ✨ Key Features

-   **🔐 Secure Authentication**: JWT-based login/signup for all user roles.
-   **🍽️ Restaurant Management**: Owners can manage menus, categories, and ingredients.
-   **🛒 Advanced Cart & Ordering**: Real-time cart updates and secure checkout flow.
-   **💳 Payment Integration**: Integrated Stripe payment gateway.
-   **👨‍💼 Admin Dashboard**: comprehensive tools for system administrators.
-   **📱 Responsive Design**: Optimized for both desktop and mobile devices.

## 🏁 Quick Start Guide

Follow these steps to get the entire system running locally.

### Prerequisites
-   Java JDK 17+
-   Node.js v14+
-   MySQL Server

### 1. Backend Setup
Navigate to the backend directory and start the server.

```bash
cd "backend-spring boot"
# Update application.properties with your MySQL and Stripe credentials
./mvnw spring-boot:run
```
*Server runs on: `http://localhost:5454`*

### 2. Frontend Setup
Open a new terminal, navigate to the frontend directory, and start the app.

```bash
cd "frontend-react"
npm install
npm start
```
*App runs on: `http://localhost:3000`*

## 📂 Repository Structure

```
/
├── backend-spring boot/   # Spring Boot Application
│   ├── src/
│   ├── pom.xml
│   └── README.md          # Backend-specific documentation
│
└── frontend-react/        # React Application
    ├── src/
    ├── package.json
    └── README.md          # Frontend-specific documentation
```

## 🤝 Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

---
*Built with ❤️ by the CodeStorm Team*

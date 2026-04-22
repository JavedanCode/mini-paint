# 🎨 Mini Paint (Java Swing)

A lightweight drawing application built with Java Swing.
This project focuses on mastering **custom painting (`paintComponent`)**, mouse interaction, and clean GUI structure—without unnecessary complexity.

---

## ✨ Features

* 🖌️ Freehand drawing with mouse (click + drag)
* 🎨 Multiple color selection
* 📏 Adjustable brush thickness (S / M / L)
* 🧽 Clear canvas
* 🧩 Clean and extensible code structure

---

## 🏗️ Project Structure

```
MiniPaint/
 ├── Main.java          // Entry point
 ├── PaintFrame.java   // Main window (UI + toolbar)
 ├── CanvasPanel.java  // Drawing logic + mouse handling
 └── Stroke.java       // Data model for strokes
```

### 🧠 Architecture Overview

* **PaintFrame** → Handles layout and UI components
* **CanvasPanel** → Core drawing logic (`paintComponent`)
* **Stroke** → Stores points, color, and thickness for each stroke

This separation keeps the project simple but scalable.

---

## 🚀 How to Run

1. Compile all `.java` files:

   ```
   javac *.java
   ```

2. Run the application:

   ```
   java Main
   ```

---

## 🎯 Learning Goals

This project was built to practice:

* Custom rendering with `paintComponent(Graphics g)`
* Mouse input handling (`MouseListener`, `MouseMotionListener`)
* Managing state in a GUI application
* Basic Swing layouts and components
* Using `Graphics2D` for better rendering (stroke thickness)

---

## 🧩 How It Works

* Each time the user presses the mouse → a new **Stroke** is created
* As the mouse is dragged → points are added to the current stroke
* The canvas repaints → connecting points into lines

Each stroke remembers:

* Its **color**
* Its **thickness**
* Its **path (list of points)**

---

## 🔧 Future Improvements

This project is intentionally simple, but it’s designed to grow.
Here are some natural next steps:

### 🎨 Drawing Features

* Eraser tool
* Brush shapes (circle, square)
* Smooth curves instead of straight segments

### 🧠 Functionality

* Undo / Redo
* Save drawing as image (PNG)
* Load previous drawings

### 🖥️ UI Improvements

* Color picker (instead of fixed buttons)
* Brush size slider
* Status bar (current color / size)

---

## ⚠️ Notes

* Uses **Swing**, not JavaFX (intentionally kept minimal)
* Layout uses simple managers (FlowLayout, BorderLayout)
* `setPreferredSize()` is used instead of `setSize()` due to layout behavior

---

## 💭 Final Thoughts

This project is less about building a full paint application and more about:

* understanding **how drawing works in Swing**
* building a **clean, extendable structure**

It’s a solid foundation if you want to explore:

* more advanced GUI apps
* animation
* or even game-like rendering systems

---

If you revisit this later, you’ll find it easy to extend—everything important is already in the right place.

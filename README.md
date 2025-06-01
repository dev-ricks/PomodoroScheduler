# Pomodoro Scheduler: 

A tool for Work time and Break time reminders, for use while practicing the Pomodoro Technique.

## Table of contents

- [Overview](#overview)
    - [The challenge](#the-challenge)
    - [Screenshot](#screenshot)
    - [Links](#links)
- [My process](#my-process)
    - [Built with](#built-with)
    - [What I learned](#what-i-learned)
    - [Continued development](#continued-development)
- [Author](#author)

## Overview

### The challenge

Users should be able to:

- Run the Pomodoro timer and let it run in the background and receive a notification by voice when the time is work time or break time.

### Screenshot

![](/images/PomodoroApp.png)

### Links

- GitHub URL: [Project PomodoroScheduler](https://github.com/dev-ricks/PomodoroScheduler)

## My process

### Built with

- Java version 23
- JavaFX for the GUI
- OpenJFX for the JavaFX library
- FreeTTS for the text-to-speech functionality
- Maven for dependency management

### What I learned

I learned how to create a simple Pomodoro timer application using Java and JavaFX. I implemented a timer that counts down from a specified work duration, plays a notification sound, and uses text-to-speech to announce the end of work time or break time. I also learned how to use JavaFX for building the user interface and FreeTTS for text-to-speech functionality.

Plenty of documentation and tutorials are available online to help you get started with JavaFX and FreeTTS. Here are some resources that I found particularly helpful:

- [JavaFX Documentation](https://openjfx.io/openjfx-docs/)
- [JavaFX using Maven](https://openjfx.io/openjfx-docs/index.html#maven)
- [JavaFX API Documentation](https://openjfx.io/javadoc/23/)
- [FreeTTS Home Page](https://freetts.sourceforge.net/)
- [FreeTTS Documentation](https://freetts.sourceforge.net/docs/index.php)
- [FreeTTS API Documentation](https://freetts.sourceforge.io/javadoc/index.html)

Some things of interest that I learned while working on this project:
- How to set up a JavaFX project with Maven.
- How much JavaFX can operate as a MVC application pattern, which I would totally expect for most UI frameworks.
- FreeTTS is not bad for some basic text-to-speech functionality, but it does seem a bit complicated to setup to use better voices. I used the default voice, which is not bad, but I would like to explore using other voices in the future.

### Continued development

One of the reasons I chose to use JavaFX for this project is that I am working on another project that will use an AI implementation that can be used to simulate a battlefield choice of action in a board game. I wanted to use JavaFX for the GUI of that project as well, so I thought it would be a good idea to get some practice with it.

As I said before, I would like to explore using other voices with FreeTTS, as well as possibly using a different text-to-speech library altogether.

I would like to make the application able to run in the background and allow the user to set custom work and break durations. Make the application taskbar friendly, with some more as of yet unthought of features.

I would also like to add a feature that allows the user to pause and resume the timer. Maybe a
reset button feature as well, so the user can reset the timer to the original work duration without having to close and reopen the application.

## Author
Richard Smit

- GitHub - [dev_ricks](https://github.com/dev-ricks?tab=repositories)
- Linked In - [Introduction](https://www.linkedin.com/in/richard-smit-1a811b87/)
- Twitter - [@Rick_S_Dev](https://x.com/Rick_S_Dev)

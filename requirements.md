# Requirements

## Project Name: Slither Improvement Project (S.I.P)
### Team Manager: Peter Richards
---

## Project Type: Video Game Modification
- Project Start Date: Wednesday 16th October
- Project End Date: Wednesday 23rd October
---

## Contents

1. Introduction
1.1 Intended Audience of this Documents
1.2 Intended use
1.3 Scope
1.4 Definitions and Acronyms

2. Users
2.1 Stakeholders
2.2 Needs

3. System Features and Requirements
3.1 Functional Requirements
3.2 Non-functional Requirements

## 1. Introduction

### 1.1 Inteded Audience

This document is for the various developers, managers and collaborating end users in this project.

### 1.2 Intended Use

This document is for the purpose of collaborating on a consistent set of requirements and for the project, so the project can clearly be judged a success, failure, and what incremental improvements need to be made.

### 1.3 Scope

The scope of this project is a series of small modifications to the original open-source Slither.IO port, targeting the existing graphical system. Chiefly, this will include changes to colour and customisation, though as the team grow in skill the domain may increase.

### 1.4 Defintions and Acronyms

This document will use a series of acronyms for brevity, which will be documented below:
1. S.I.P- Slither Improvement Project.
2. RD - Requirements Document (this document).
3. Port- A sub-version of an existing piece of software, heavily based on the origin with changes to make it work on another system.

## 2. Users

### 2.1 Stakeholders
**Kristian**
Kristian is a competitive Slither.IO player, who has recently started using the Java implementation of the game as it allows him to make customisation to his game. He likes making modifications in order to increase his skill in the game, through better visual cues etc.

## 3 System Features and Requirements

### 3.1 Functional Requirements

**Colour Changing Snake**
The original browser-based game allowed for skin customisation for your snake, from a list of existing presets. These do exist in the java-based port, as the websocket does transmit the colour of the snake to and from the server, though it doesn't implement them.

*1. The snakes colour should be selectable by the user.*
*2. The colours of other players snakes must be visible to the user.*

**Colour Changing Food**
In the game there are various items to help your snake grow in size, 'food'. As the game gets very busy visually, food can become hard to spot on screen as it is all the same colour, which in the base java port, is the same colour as the snake, making the problem worse.

*1. The colour of the food will change at random to increase visibility.*

**Commenting the Code**
The original project is an open source varient of the popular browser game, though it is poorly documented. This made the changes to the program quite hard.

*1. Comment each section of the code as they're improved, to allow future developers to make changes of their own.*
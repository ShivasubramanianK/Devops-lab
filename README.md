# Java Quiz Application

A simple Java console-based quiz app built for learning and practice.

## Features
- Multiple-choice questions
- Score tracking
- Final result summary
- Easy to expand with more questions

## Project structure

```text
src/
├── Question.java
├── Quiz.java
└── QuizApp.java
```

## Run the app

```bash
javac src/*.java
java -cp src QuizApp
```

## Example
The app asks a series of Java-related questions, validates the user answer, and prints the final score at the end.
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Install') {
            steps {
                bat 'py -m pip install flask'
            }
        }

        stage('Build') {
            steps {
                bat 'py -m py_compile app.py'
            }
        }

        stage('Run') {
            steps {
                bat 'py app.py'
            }
        }
    }

    post {
        success {
            echo 'Python Project Success'
        }
        failure {
            echo 'Python Project Failed'
        }
    }
} for java
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                bat 'javac Main.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java Main'
            }
        }
    }

    post {
        success {
            echo 'Java Project Success'
        }
        failure {
            echo 'Java Project Failed'
        }
    }
} for python
py -m pip install -r requirements.txt
py -m py_compile app.py
py -c "from app import app; assert app.test_client().get('/').status_code == 200; print('Test Passed')" for python
javac Main.java
java Main for java

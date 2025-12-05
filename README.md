# Code Repository Guidelines

This repository is intended for storing implementation code and facilitating structured code reviews within the team. [web:10][web:23]

## Workflow Overview

Follow the steps below for every new contribution so that reviewers can reliably pull, run, and review your code. [web:18][web:22]

## Step 1: Clone the repository

- Clone the shared repository to your local machine:
  - `git clone <repository-url>`

## Step 2: Create your personal branch

- Create and switch to a personal branch named using your full name or agreed team convention:
  - `git checkout -b <your-name>` 
- Use this branch as the base for all your topic-specific branches.

## Step 3: Create a topic branch

- For each topic or assignment, create a separate branch from your personal branch:
  - `git checkout -b <topic-name>` 
- Add your full project for that topic (all necessary source, configuration, and resource files).

## Step 4: Push the topic branch

- Commit your changes and push the topic branch to the remote:
  - `git add .`
  - `git commit -m "Add <topic-name> implementation"`
  - `git push -u origin <topic-name>`
- Ensure the entire project is present so the reviewer can pull the branch and run the code without missing dependencies. 

## Step 5: Add documentation

- Include a Markdown file (for example, `README.md` or `INSTRUCTIONS.md`) in the project root with:
  - Environment and tool prerequisites.
  - Steps to build, run, and test the project.
  - Any additional notes required for review.

## Step 6: Request review

- Notify the designated reviewer once:
  - The topic branch is pushed, and
  - Documentation is complete.
- The reviewer will pull the topic branch, follow the documentation, and provide feedback through the agreed review channel (for example, pull request comments).

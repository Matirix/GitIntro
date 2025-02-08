# GitIntro
# Getting Started with Git and GitHub

This guide will walk you through installing Git, setting up GitHub, and using basic Git commands to manage branches and commit changes. 

## Installing Git

### Windows
1. Download Git from [git-scm.com](https://git-scm.com/downloads).
2. Run the installer and follow the default installation settings.
3. Open **Git Bash** to start using Git.

### macOS
1. Open **Terminal**.
2. Run the command:
   ```sh
   brew install git
   ```
3. Verify the installation by running:
   ```sh
   git --version
   ```

## Setting Up Git
1. Configure your username and email:
   ```sh
   git config --global user.name "Your Name"
   git config --global user.email "your.email@example.com"
   ```
2. Check your Git configuration:
   ```sh
   git config --list
   ```

## Using Git with GitHub

### 1. Clone a Repository
To copy an existing GitHub repository to your computer:
```sh
git clone https://github.com/username/repository.git
```

### 2. Creating a New Branch
To create and switch to a new branch:
```sh
git checkout -b yourname-branch
```

### 3. Switching Between Branches
To switch branches:
```sh
git switch main
```

### 4. Making Changes and Adding to the github repository
1. Make changes to your files.
2. Create a new Class with your name and a main driver. Print out "Hello from [your name]".
3. Add the changes:
   ```sh
   git add .
   ```
4. Commit the changes:
   ```sh
   git commit -m "Added new feature"
   ```

### 5. Pushing Changes to GitHub
Send your changes to GitHub:
```sh
git push origin yourname-branch
```


### 6. Pulling the Latest Changes
To get the latest updates from GitHub:
```sh
git pull origin main
```

## Summary of Git Commands
| Command | Description |
|---------|-------------|
| `git clone <repo>` | Clone a repository |
| `git branch <name>` | Create a new branch |
| `git switch <branch>` | Switch branches |
| `git checkout -b <branch>` | Create and switch to a new branch |
| `git add .` | Stage changes |
| `git commit -m "message"` | Commit changes |
| `git push origin <branch>` | Push changes to GitHub |
| `git pull origin <branch>` | Pull latest changes |
| `git merge <branch>` | Merge a branch |
| `git branch -d <branch>` | Delete a branch |

This guide provides the basics, but there's much more to learn! Check out the official [Git documentation](https://git-scm.com/doc) for more details. 🚀

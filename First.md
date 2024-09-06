* Set Java
  - Settings -> Build,Exec... -> Java compiler 
    - or File -> project structure
  * Go to File > Settings -> Editor > General.
    - Scroll down to the Mouse Control section.
    - Check the box for Change font size (Zoom) with Ctrl+Mouse Wheel.
    - Click Apply and then OK.
  
* psmv -> public static void main  
  
* new folder/project in project 
  - Folder , right-click , New- > Module 
  
* control + shifht + enter => ';' in the end of lien 
  
* alt + 1 : anigi , klini to project tab  
* alt +7 : anigi structure   
  * shift 2 times => search anything  
  
* echo "# ECE318" >> README.md
  git init
  git add README.md
  git commit -m "first commit"
  git branch -M main
  git remote add origin https://github.com/kos00pas/ECE318.git
  git push -u origin main

git add. 
git push 

  
<<<<<<< Updated upstream
  
=======
 move to second version 
*  git checkout -b code_2
*  git commit -m "New changes in code_2"
* git push origin code_2

** move to a version that is already created then 
  -> git checkout code_X
>>>>>>> Stashed changes

temporarily save them and remove them from the working directory):
- git stash
  then go to the version you want to get as initial to the new one
- e.g. start from point code_2
- git checkout code_2
- git checkout -b code_6
  if you want to apply the saved stach changes -> git stash apply
  then , add , commit , push
* if i mistakly made git stash.  apply
1. Undo the changes made by  -git reset --hard HEAD
2. If you want to keep the stash but undo the application:  -> git checkout -- .
3. If you don't need the stash anymore: -> git stash drop

If you want to delete a branch from the remote repository (e.g., GitHub):

bash
Copy code
git push origin --delete branch_name

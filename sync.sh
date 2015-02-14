printf "Fetching upstream...\n"
git fetch upstream
printf "\nChecking out master...\n"
git checkout master
printf "\nMerging upstream into master...\n"
git merge upstream/master
printf "\nCOMPLETE!"

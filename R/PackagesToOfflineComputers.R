#source https://github.com/MangoTheCat/blog_installing_packages

setwd("C:/Users/ArielWebster/Desktop/neuralnet2")

#make downloadable R package that won't have anything missing
getDependencies <- function(packs){
  dependencyNames <- unlist(
    tools::package_dependencies(packages = packs, db = available.packages(), 
                                which = c("Depends", "Imports"),
                                recursive = TRUE))
  packageNames <- union(packs, dependencyNames)
  packageNames
}
# Calculate dependencies
packages <- getDependencies(c("neuralnet"))

#run on offline computer
setwd ("C:/Users/Ariel/Desktop/neuralnet2") #directed folder on Desktop
pkgFilenames <- read.csv("pkgFilenames.csv", stringsAsFactors = FALSE)[,1]
install.packages(pkgFilenames, repos = NULL, type = "win.binary")

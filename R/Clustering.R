
p <- ggplot(data=na.omit(Compare), aes(y=AveBig, x= Second.Degree, color = Graph))
p <- p + geom_point()	
p <- p + geom_smooth(group=1)
p <- p + ylim(0, 100)
#p <- p + xlim(1,5)
p <- p + xlab("Clustering") + ylab("Average Large Opinion")
#p <- p + geom_line(aes())
#p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Random and Preferential Networks")
print(p)

p <- ggplot(data=na.omit(StablePreferential), aes(y=AveBig, x= MedianTime, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
#p <- p + xlim(1,5)
#p <- p + xlab("Clustering") + ylab("Average Large Opinion")
#p <- p + geom_line(aes())
#p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Random and Preferential Networks")
print(p)

p <- ggplot(data=Compare, aes(y=Certainty.Big, x= Second.Degree, color = Graph))
p <- p + geom_point()
p <- p + geom_smooth(aes(ymin = lcl, ymax = ucl))
p <- p + ylim(0, 100)
#p <- p + xlim(1,5)
p <- p + xlab("Clustering") + ylab("Average Large Opinion")
#p <- p + geom_line(aes())
#p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Random and Preferential Networks")
print(p)

qplot(wt, mpg, data=mtcars, colour=factor(cyl))
model <- lm(mpg ~ wt + factor(cyl), data=mtcars)
grid <- with(mtcars, expand.grid(
  wt = seq(min(wt), max(wt), length = 20),
  cyl = levels(factor(cyl))
))

grid$mpg <- stats::predict(model, newdata=grid)

qplot(wt, mpg, data=mtcars, colour=factor(cyl)) + geom_line(data=grid)

err <- stats::predict(model, newdata=grid, se = TRUE)

grid$ucl <- err$fit + 1.96 * err$se.fit
grid$lcl <- err$fit - 1.96 * err$se.fit

qplot(wt, mpg, data=mtcars, colour=factor(cyl)) +
  geom_smooth(aes(ymin = lcl, ymax = ucl), data=grid, stat="identity")

############################
mtcars

c <- ggplot(CompareSocial , aes(Second.Degree, Ave.Degree))
c + geom_point()
c <- ggplot(Compare , aes(First.Degree, Ave.Degree))
c + geom_point()
c <- ggplot(Compare, aes(First.Degree, Percent.Small))
c + stat_smooth()



###THIS HERE
c <- ggplot(Compare, aes(Ave.Degree, Second.Degree)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)  + geom_point()

c <- ggplot(Compare.Un, aes(x=Ave.Degree, y=Certainty.Small, color = Graph)) + facet_grid(. ~Confidence)
c + stat_smooth(method=lm) + geom_point()

c <- ggplot(Compare.Un, aes(Second.Degree, Certainty.Small)) + facet_grid(.~Confidence)
c + stat_smooth() + geom_point()

c <- ggplot(ComparePersonal.Un, aes(Second.Degree, Certainty.Small)) + facet_grid(.~Confidence)
c + stat_smooth() + geom_point()

c <- ggplot(ComparePreferential.Un, aes(Second.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + geom_smooth() + geom_point()

#CompareSocial.Un - SecondDegree AveSmall no correlation. 

#Shows that 
c <- ggplot(Compare.Un, aes(First.Degree, Certainty.Big)) +facet_grid(. ~Confidence)
c + stat_smooth(method=lm)+ geom_point()

c <- ggplot(Compare.Un, aes(First.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)

c <- ggplot(ComparePersonal.Un, aes(First.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)

c <- ggplot(ComparePreferential.Un, aes(Ave.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm) + geom_point()

c <- ggplot(CompareSocial.Un, aes(First.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)

c <- ggplot(Compare, aes(Second.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)

c <- ggplot(Compare.Un, aes(Second.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method=lm)

c <- ggplot(Compare.Un, aes(Second.Degree, Certainty.Small))
c + stat_smooth(method=lm)

c <- ggplot(ComparePersonal.Un, aes(Second.Degree, Certainty.Small))
c + stat_smooth(method=lm)

c <- ggplot(ComparePreferential.Un, aes(Second.Degree, Certainty.Small)) 
c + stat_smooth(method=lm)

c <- ggplot(CompareSocial, aes(Second.Degree, Certainty.Small))
c + stat_smooth()

c <- ggplot(ComparePreferential, aes(Ave.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth()

c <- ggplot(CompareSocial, aes(Ave.Degree, First.Degree)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point()	

c <- ggplot(ComparePreferential, aes(Second.Degree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth()

c <- ggplot(StableLTG, aes(Average.Degree, X..Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point()

c <- ggplot(StablePersonal, aes(Average.Degree, MedianTime)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point()



c <- ggplot(Stable, aes(MaxDegree, X..Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(AveHighDegree, X..Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(AveMidDegree, X..Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(MaxDegree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(AveHighDegree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point()+ ylim(0, 100)

c <- ggplot(Stable, aes(AveMidDegree, Certainty.Small)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(MaxDegree, Certainty.Big)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(AveHighDegree, Certainty.Big)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(Stable, aes(AveMidDegree, Certainty.Big)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(StableLTG, aes(MaxDegree, MedianTime)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(StableLTG, aes(AveHighDegree, MedianTime)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth() + geom_point() + ylim(0, 100)

c <- ggplot(na.omit(StableLTG), aes(AveMidDegree, MedianTime)) + facet_grid(. ~ Model~Confidence)
c + geom_point() + ylim(0, 100)




c <- ggplot(ConqueredM2, aes(DiffMinusNA, DiffTimeMinusNA, color = factor(Group)))
c + geom_point() + ylim(0, 100)+ facet_grid(. ~ Model~Confidence) #+ geom_smooth(method = lm)#geom_smooth(se = FALSE)


c <- ggplot(StablePreferential, aes(Second.Degree, MedianTime)) + facet_grid(. ~ Model~Confidence)
c + stat_smooth(method = lm) + geom_point()

#Might do another run and make note of highest and lowest certainty at Consensus
#then plot lowest certainty at consensus with stable certainty.
#If rerunning also rise limit of time to 100,000 see if you can get some more in group 1 to finish



c <- ggplot(Conquered, aes(AveHighDegree, X..Small, color = factor(Group)))
c + geom_point() + facet_grid(. ~ Model~Confidence)

c <- ggplot(ConqueredM1, aes(Large2, Time2, color = Uniformity.Time, size = 2)) #signif(First.Degree,digits = 4)))
c + geom_point() + scale_colour_gradient(low="darkblue",high="darkorange")

c <- ggplot(ConqueredSocial, aes(DiffTime, DiffCert, color = factor(Second.Degree), size = 1.5)) #signif(First.Degree,digits = 4)))
c + geom_point() + facet_grid(. ~ Model)

signif(1.23456789, digits = 4)



# MODEL 2 ANALYSIS STARTS#################################################
##########################################################################
c <- ggplot(ConqueredM2, aes(Second.Degree, Time.Step, color = Nodes)) #signif(First.Degree,digits = 4)))
c + geom_point() + scale_colour_gradient(low="darkblue",high="darkorange")

c <- ggplot(ConqueredM2, aes(Second.Degree, Time.Step, color = Nodes)) #signif(First.Degree,digits = 4)))
c + geom_point() + scale_colour_gradient(low="darkblue",high="darkorange")

c <- ggplot(ConqueredM2, aes(Time.Step, X..Small))
c + geom_point() + facet_grid(. ~ Model~Confidence) + geom_smooth(method = lm) #+ xlab("Decrease in Certainty from Uniformity to Stability") + ylab("Time Between Uniformity and Stability") + ggtitle("Time and Certainty")







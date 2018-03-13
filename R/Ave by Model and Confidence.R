ConqueredM1NA[ConqueredM1NA$Uniformity == "Uniformity", ],
p <- ggplot(data=ConqueredM1NA[ConqueredM1NA$Uniformity == "Uniformity",], aes(y=d, x= Nodes))
p <- p + geom_point(aes(color = Second.Degree))	
p + stat_smooth(method = "loess", formula = y ~ x)
#p <- p + ylim(0, 100)
#p <- p + geom_line(aes(color = Second.Degree))
#p <- p + facet_grid(~Group)
#p <- p + ggtitle("Social Networks")
#p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
print(p)



ConqueredM1NA[ConqueredM1NA$Uniformity == "Uniformity", ],
p <- ggplot(data=ConqueredM1NA[ConqueredM1NA$Uniformity == "Standoff",], aes(y=Second.Degree, x= Time.Step))
p <- p + geom_point(aes(color = Second.Degree))	
p + stat_smooth(method = "loess", formula = y ~ x)
#p <- p + ylim(0, 100)
#p <- p + geom_line(aes(color = Second.Degree))
#p <- p + facet_grid(~Group)
#p <- p + ggtitle("Social Networks")
#p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
print(p)

#First Five Social Percent by Time Graphs
p <- ggplot(data=All, aes(y=AveSmall, x= TimeStep))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
#p <- p + ggtitle("Social Networks")
#p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
print(p)

#First Five Social Percent by Time Graphs
p <- ggplot(data=na.omit(PreferentialFF), aes(y=AveSmall, x= TimeStep))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Social Networks")
p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
print(p)

#Preferential and Random Percent by Time  Graphs
p <- ggplot(data=na.omit(PreferentialFF.Full), aes(y=AvePercent, x= TimeStep))
p <- p + ylim(0, 100)
p <- p + geom_point()							
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Preferential and Random")
print(p)

# Preferential and Random Percent by Time Based on Size
p <- ggplot(data=na.omit(Preferential), aes(y=AvePercent, x= TimeStep, color = Nodes, group = Graph))
p <- p + ylim(0, 100)
p <- p + geom_point()							
p <- p + geom_line(aes())
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Preferential and Random")
print(p)


# Personal Percent by Time Based on Size
p <- ggplot(data=na.omit(PersonalFF.Full), aes(y=AvePercent, x= TimeStep, group = Graph, color = Nodes))
p <- p + ylim(0, 100)
p <- p + xlim(1,5)
p <- p + geom_point()							
p <- p + geom_line(aes())
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Personal")
print(p)

# Personal Percent by Time Based on Size
p <- ggplot(data=na.omit(PersonalFF.Full), aes(y=AvePercent, x= TimeStep, group = Graph, color = Nodes))
p <- p + ylim(0, 100)
p <- p + xlim(1,5)
p <- p + geom_point()					
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Personal")
print(p)

#Lines, Trees, and Grids Percent by Time Graphs
p <- ggplot(data=na.omit(SocialFF.Full), aes(y= AvePercent, x= TimeStep, group = Graph))
p <- p + ylim(0, 100)
p <- p + stat_smooth(method=lm)
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model)
p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
p <- p + ggtitle("Lines, Trees, and Grids")
print(p)

#Random Preferential Percent by Time Graphs
p <- ggplot(data=na.omit(RandomPreferentialFF), aes(y=AvePercent, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("RandomPreferential")
print(p)

a <- data.frame(x = Personal[["Percent.Small"]], y = Personal[["TimeStep"]])
b <- data.frame(x = Personal[["Certainty.Big"]], y = Personal[["TimeStep"]])


#Personal Percent by Time Graphs
p <- ggplot(data=na.omit(Personal.Full), aes(y=AvePercent, x= TimeStep, group = Graph, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes())
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
p <- p + ggtitle("Personal")
print(p)

#Frist Five Personal Percent by Time Graphs
p <- ggplot(data=na.omit(PersonalFF.Full), aes(y=AvePercent, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + xlab("Time Step") + ylab("Average Percent with S Opinion")
p <- p + ggtitle("Personal Networks")
print(p)


#First Five Random Preferential Certianty Big by Time Graphs
p <- ggplot(data=na.omit(Preferential.Full), aes(y=AveSmall, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + xlim(1, 5)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Random Preferential")
print(p)

#Social Certianty Big by Time
p <- ggplot(data=na.omit(Social.Full), aes(y=AveBig, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Nodes))
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Social Networks")
print(p)

#First Five Social Certianty Big by Time
p <- ggplot(data=na.omit(Social.Full), aes(y=AveBig, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Nodes))
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Social Networks")
print(p)

#First Five Lines, Trees, and Grids Certianty Big by Time Graphs
p <- ggplot(data=na.omit(TLGFF), aes(y=AveBig, x= TimeStep, group = Graph))
p <- p + geom_point()	
p <- p + ylim(75, 100)
p <- p + xlim(1, 5)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Lines, Trees, and Grids")
print(p)

#First Five Lines, Trees, and Grids Certianty Big by Time Graphs
p <- ggplot(data=Preferential, aes(y=Percent.Small, x= TimeStep, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + xlim(0, 5)
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Lines, Trees, and Grids")
print(p)

###############Node Colors################

#First Five Social Networks Percent by Time Based on Size
p <- ggplot(data=na.omit(SocialFF.Full), aes(y=AvePercent, x= TimeStep, color = Nodes, group = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes())
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Social Networks")
print(p)


#TGL-PercentTime
p <- ggplot(data=TGL, aes(y=AveSmall, x= TimeStep, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
#p <- p + xlim(1,5)
p <- p + xlab("Time Step") + ylab("Average Percent Small Opinion")
p <- p + geom_line(aes())
#p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Line Tree Grid")
print(p)


#Social Percent by Certianty Big
p <- ggplot(data=Preferential, aes(y=Percent.Small, x= Certainty.Big, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
#p <- p + geom_line(aes())
#p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
#p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + facet_grid(~Model)
p <- p + ggtitle("Social Percent by Certianty Big")
print(p)


#First Five Social Percent by Certainty Small
p <- ggplot(data=na.omit(PreferentialFF), aes(y=AveSmall, x= TimeStep, color = Graph))
p <- p + geom_point()	
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
#p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + ggtitle("Social Networks")
print(p)

# First Five Preferential Percent by Time Based on Size
p <- ggplot(data=na.omit(SocialFF), aes(y=AveBig, x= TimeStep, color = Nodes))
p <- p + geom_point()
p <- p + ylim(0, 100)
p <- p + geom_line(aes(color = Graph))
p <- p + facet_wrap(~Model)		#panel by TimeStep
p <- p + facet_grid(~Model~Confidence)
p <- p + scale_colour_gradient(low="darkorange",high="darkblue")
p <- p + ggtitle("Social Networks")
print(p)

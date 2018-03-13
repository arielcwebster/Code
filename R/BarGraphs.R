# Generate data
c <- ggplot(ConqueredM1, aes(factor(Group)))

# By default, uses stat="bin", which gives the count in each category
c + geom_bar()

qplot(factor(Graph), data=ConqueredM1NA, geom="bar", fill=factor(Uniformity))
qplot(factor(Group), data=ConqueredM1, aes(), geom="bar", fill=factor(Uniformity))


library(plyr)
bb.perc <- ddply(ConqueredM1,.(Group,Uniformity))

c <- ggplot(ConqueredM1,aes(factor(Group),fill=factor(Uniformity))) 
c + geom_bar() +scale_y_continous(labels=percent)

ggplot(ConqueredM1NA[ConqueredM1NA$Group != 0, ],aes(x = factor(Group), fill = factor(Uniformity), 
                             y = (..count..)/sum(..count..))) +
  geom_bar() +
  stat_bin(geom = "text",
           aes(label = paste(round((..count..)/sum(..count..)*100), "%")),
           vjust = 5) 


p <- qplot(factor(Group), data = ConqueredM1NA[ConqueredM1NA$Group != 0, ], fill = factor(Uniformity))
p <- p + xlab("Group") + ylab("Count")
p <- p + ggtitle("Standoff or Uniformity")
colors <- c("darkblue", "red")
p + scale_fill_discrete(name="State of \nStability") + scale_fill_brewer()

p + scale_fill_discrete(name="Experimental\nCondition",
                         breaks=c("ctrl", "trt1", "trt2"),
                         labels=c("Control", "Treatment 1", "Treatment 2"))

# Using a manual scale instead of hue
p + scale_fill_manual(values=c("#999999", "#E69F00", "#56B4E9"), 
                       name="Experimental\nCondition",
                       breaks=c("ctrl", "trt1", "trt2"),
                       labels=c("Control", "Treatment 1", "Treatment 2"))



#n by d graph, a line showing where the upper bound is and then colors of nodes
#showing how long it actually took

c  <- ggplot(ConqueredM1[ConqueredM1$Group != 0, ], x = Graph, y = O.nd.) 
c + geom_bar() 
  stat_bin(geom = "text",
           aes(label = paste(round((..count..)/sum(..count..)*100), "%")),
           vjust = 5) 

  qplot(factor(Group), data = ConqueredM1NA[ConqueredM1NA$Group != 0, ], fill = factor(Uniformity))
  
  
  p <- qplot(factor(Group), data = ConqueredM1NA[ConqueredM1NA$Group != 0, ], fill = factor(Uniformity))
  p <- p + xlab("Group") + ylab("Count")
  p <- p + ggtitle("Standoff or Uniformity")
  p + scale_fill_discrete(name ="State of \nStability") + theme(axis.text=element_text(size=14), axis.title=element_text(size=14,face="bold"))
  
  
a <- qplot(factor(Graph), data=ConqueredM1NA[ConqueredM1NA$Group != 0, ], geom="bar", fill=factor(Uniformity)) + facet_grid(. ~ Group, scales="free")
a + theme(axis.text.x = element_text(angle = 45, hjust = 1))
  
ggplot(data=ConqueredM1NA[ConqueredM1NA$Group != 0, ], aes(x=Graph, fill=factor(Uniformity))) +
    geom_bar(position = 'dodge', stat="identity") +
    geom_text(aes(label=paste(Value, "%")), position=position_dodge(width=0.9), vjust=-0.25) + 
    facet_grid(. ~ Group) + 
    theme(legend.position="none")


a <- qplot(factor(Graph), data=ConqueredM1NA[ConqueredM1NA$Group != 0, ], geom="bar", fill=factor(Uniformity)) 
a <- a + facet_grid(. ~ Group, scales="free")
a <- a + xlab("Group") + ylab("Count")
a <- a + ggtitle("Standoff or Uniformity")
a <- a + scale_fill_discrete(name ="State of \nStability") 
a + theme(axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


temp = aggregate(list(score = df$score), list(age = factor(df$age)), mean)

b <- qplot(factor(Graph), data=ConqueredM1NA[ConqueredM1NA$Group != 0, ], geom="bar", fill=factor(Uniformity), y = (..Time2..)/sum(..count..))
b <- b + geom_bar(stat='identity')
b <- b + facet_grid(. ~ Group, scales="free")
b <- b + xlab("Group") + ylab("Count")
b <- b + ggtitle("Standoff or Uniformity")
b <- b + scale_fill_discrete(name ="State of \nStability") 
b + theme(axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


meanprice <- tapply(diamonds$price, diamonds$cut, mean)
cut <- factor(levels(diamonds$cut), levels = levels(diamonds$cut))
qplot(cut, meanprice, geom="bar", stat="identity", fill = I("grey50"))

meantime <- tapply(ConqueredM1NA$Time2, ConqueredM1NA$Graph, mean)
cut <- factor(levels(diamonds$cut), levels = levels(diamonds$cut))
qplot(cut, meanprice, geom="bar", stat="identity", fill = I("grey50"))


b <- qplot(factor(Graph), data=ConqueredM1NA[ConqueredM1NA$Group != 0, ], geom="bar",  y = meantime)
b <- b + geom_bar(stat='identity')
b <- b + facet_grid(. ~ Group, scales="free")
b <- b + xlab("Group") + ylab("Count")
b <- b + ggtitle("Standoff or Uniformity")
b <- b + scale_fill_discrete(name ="State of \nStability") 
b + theme(axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))

a <- qplot(Time.Step, data=ConqueredM1NA[ConqueredM1NA$Uniformity == "Standoff", ], geom="bar", fill=factor(First.Degree)) 
#a <- a + facet_grid(. ~ Group, scales="free")
#a <- a + xlab("Group") + ylab("Count")
#a <- a + ggtitle("Standoff or Uniformity")
#a <- a + scale_fill_discrete(name ="State of \nStability") 
a + theme(axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


a <- qplot(DiffTime, data=ConqueredM1NA[ConqueredM1NA$Uniformity == "Uniformity", ], geom="bar") 
#a <- a + facet_grid(. ~ Group, scales="free")
#a <- a + xlab("Group") + ylab("Count")
#a <- a + ggtitle("Standoff or Uniformity")
#a <- a + scale_fill_discrete(name ="State of \nStability") 
a + theme(axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


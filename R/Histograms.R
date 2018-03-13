set.seed(42)
p1 <- hist(rnorm(500,4))                     # centered at 4
p2 <- hist(rnorm(500,6))                     # centered at 6
plot( a, col=rgb(0,0,1,1/4) )  # first histogram
plot( b, col=rgb(1,0,0,1/4),  add=T)  # second

DiffNeg<-(Compare[["DiffNeg"]])
PDiffNeg<-(PersonalLast[["DiffNeg"]])
SDiffNeg<-(SocialNetworksLast[["DiffNeg"]])
TDiffNeg<-(TLGLast[["DiffNeg"]])
RDiffNeg<-(RandomPreferentialLast[["DiffNeg"]])
qplot(Ninety, data=mtcars, geom="bar")
hist(DiffPos, bor = "darkorange", col = "darkblue", breaks=40, las = 1)
hist(DiffNeg, bor = "gold", breaks=40, las = 1, add=T)

par(bg="white")
a <- hist(PDiffNeg, bor = "darkorange", col = "darkred", breaks=40, las = 1, ylim = c(0,5), xlim = c(-75, 75))
b <- hist(SDiffNeg, bor = "black", breaks=40, las = 1, ylim = c(0,5), xlim = c(-75, 75))
hist(TDiffNeg, bor = "darkorange", col = "darkorange", breaks=40, las = 1, add=T, density = c(50), ylim = c(0,5), xlim = c(-75, 75))
hist(RDiffNeg, bor = "darkslateblue", breaks=40, las = 1, density = c(50), add = T, ylim = c(0,5), xlim = c(-75, 75))
lines(density(DiffPos))
legend("topright", c("Personal", "Social", "TreeGridLine", "Preferential"), fill=c("darkred", "black", "darkorange", "darkslateblue"), density = c(NA,0,50,50))
?legend


hist(SDiffNeg, col=rgb(0,0,1,1/4))
hist(TDiffNeg, col=rgb(1,0,0,1/4), add=T)

data(DiffNeg)
str(na.omit(Compare))
data(InsectSprays)
str(InsectSprays)
attach(Compare)
?attach
tapply(DiffPos, DiffNeg, mean)
tapply(DiffPos, DiffNeg, var)
tapply(DiffPos, DiffNeg, length)

?tapply

Time<-(ConqueredM1NA[["Time.Step"]])
Time
GType<-(ConqueredM1NA[["Graph"]])
GType
d <- tapply(Time, GType, mean)
hist(d)
a <- qplot(Time.Step, data=d, geom="bar") 


qplot(Graph, Time.Step, data=ConqueredM1NA, 
      stat="summary", fun.y="mean", geom="bar",
      facets =.~Group,  scales="free"
)

ggplot(ConqueredM1NA) +
  aes(Graph, Time.Step) +
  stat_summary(fun.y="mean",geom="bar") + 
  facet_grid(.~Group, scales = "free")



ggplot(ConqueredM1NA[ConqueredM1NA$Group != 1, ]) +
  aes(Graph, Larger.Certainty, fill = AveShortestPath) +
  stat_summary(fun.y="mean",geom="bar") +
  facet_grid(.~Group, scales = "free") +
  scale_fill_gradient(low = "darkblue", high = "darkorange")+
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


#Time to Stabliity M1
ggplot(ConqueredM1NA) +
  aes(Graph, Diameter, fill=Second.Degree) +
  stat_summary(fun.y="mean",geom="bar") + 
  facet_grid(.~Group, scales = "free") +
  xlab("Group") + ylab("Timesteps") +
  ggtitle("Mean Timessteps to Stability") +
  labs(fill = "Degree of \nClustering") +
  scale_fill_gradient(low = "darkblue", high = "darkorange")+
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))

#Time to Stabliity M1
ggplot(ConqueredM1NA[ConqueredM1NA$Uniformity != "Standoff", ]) +
  aes(Graph, Time2, fill=Second.Degree) +
  stat_summary(fun.y="mean",geom="bar") + 
  facet_grid(.~Group, scales = "free") +
  ylim(0,100)+
  xlab("Group") + ylab("Timesteps") +
  ggtitle("Mean Timessteps to Stability") +
  labs(fill = "Degree of \nClustering") +
  scale_fill_gradient(low = "darkblue", high = "darkorange")+
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))+
  geom_point(data=ConqueredM1NA, aes(x=Graph, y=Diameter*d), colour="black")

Otime<-(ConqueredM1NA[["d"]]*ConqueredM1NA[["Diameter"]])
MeanUppertime<-tapply(Otime, Graph, mean)
chartmean <- factor(levels(Graph), levels = levels(Graph))
qplot(chartmean, MeanUppertime) +
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))


meanprice <- tapply(diamonds$price, diamonds$cut, mean)
cut <- factor(levels(diamonds$cut), levels = levels(diamonds$cut))
qplot(cut, meanprice)+
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))

p<-ggplot(data = MeanUppertime, aes(x=Graph, y=Opp1)) + 
  facet_grid(.~Group, scales = "free") +
  stat_summary(fun.y="mean",geom="bar") +
  theme(axis.text=element_text(size=14), axis.text.x = element_text(angle = 45, hjust = 1), axis.title=element_text(size=14,face="bold"))



c <- ggplot(ConqueredM1NA[ConqueredM1NA$Group != 1, ], aes(AveShortestPath, Larger.Certainty, color = Diameter))
c + geom_point() + 
  facet_grid(. ~Group) + 
  scale_colour_gradient(low="darkblue",high="darkorange", name ="Degree of \nClustering") + 
 
  ggtitle("Time and Certainty")


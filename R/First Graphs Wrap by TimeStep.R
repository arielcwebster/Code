p <- ggplot(data=Ninety, aes(x=Nodes, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()		
p <- p + xlim(0, 500)
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)

p <- ggplot(data=Ninety, aes(x=Nodes, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ninety, aes(x=Nodes, y= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ninety, aes(x=Ave.Degree, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ninety, aes(x=Ave.Degree, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ninety, aes(y=Ave.Degree, x= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)   


p <- ggplot(data=Ten, aes(x=TimeStep, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Nodes)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=TimeStep, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Nodes)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=TimeStep, y= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Nodes)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=TimeStep, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Ave.Degree)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=TimeStep, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Ave.Degree)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(y=TimeStep, x= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~Ave.Degree)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)   

p <- ggplot(data=Ten, aes(x=Nodes, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=Nodes, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=Nodes, y= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=Ave.Degree, y= Certainty.Pos, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(x=Ave.Degree, y= Certainty.Neg, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)
p <- ggplot(data=Ten, aes(y=Ave.Degree, x= Percent.Positive, colour = Graph, shape = Model))
p <- p + geom_point()							
p <- p + facet_wrap(~TimeStep)		#panel by TimeStep
p <- p + ggtitle("Title")
print(p)   


install.packages("ggplot2")
library(ggplot2)		#load the 'ggplot2' package
citation("ggplot2")		#get a suggested citation for 'ggplot2'
library(help="ggplot2") #view table of contents


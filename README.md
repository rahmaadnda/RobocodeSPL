# RobocodeSPL for teaching
Teaching material for the implementation of a Software Product Line based on Robocode.

## What is Robocode?
Robocode is a programming game where users develop their own robots (called bots) in Java using the Robocode API. These bots are virtual tanks that fight among them. Users can put their creations in a global competition http://robowiki.net/wiki/RoboRumble. See for example the battle of two very advanced bots https://www.youtube.com/watch?v=0qtoh_PjhcU . You may want also to take a look to this video explaining different techniques https://www.youtube.com/watch?v=-aEHOm5toRc

## What is a Robocode Software Product Line?
In this hands-on experience we will create a factory of bots using the Software Product Line approach. Given a configuration of a predefined set of features, the Java program will be automatically created and the bot will have the desired features. The first task will be to analyse the domain of Robocode (see http://www.robowiki.net) and define a variability model capturing the different features that a bot can have. Then, for each feature, we will create the reusable assets that will allow to assemble the Java program. For this we will use the FeatureIDE tool https://featureide.github.io/ and a compositional approach called FeatureHouse https://www.infosun.fim.uni-passau.de/spl/apel/fh/ . But do not worry, we will start from an example (a small RobocodeSPL) that will need to be improved.

## What will you learn?
- The principles of Software Product Lines which is important in the industry to create variants of their products to satisfy different customer needs.
- A specific way to implement Software Product Lines based on feature modeling and compositional approaches. Other notations to capture the domain variability exists, as well as different ways to implement variability.
- Experience in mining software repositories and data.
- Team work (if you do it within a group).

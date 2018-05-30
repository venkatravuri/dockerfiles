# dockerfiles
Following Docker files are for Self-learning or for experimenting. 
1. javadockerfile- contains SUN JDK with hello world example, docker image generated from this is big (around 1 GB) but this is merely   used for learning purposes.
              Pull the pre-built image from here to play around
              docker pull vravuri/ubuntu-sun-java-helloworld
                            OR
              Download the source code and docker file from here and build one for yourself.
 2. dockeropenjre - Use Alphine docker pre-built image to run already compiled java source.
 3. dockeropenjdk - Use Alphine docker pre-built image to compile the source and run the compiled source.
 4. springmicro   - Use multi-stage docker to speed-up building the spring micro service ( otherwise we will have to install the dependencies on our own) and contain only the final artifact - The final image will be based on the last build stage.

# ProCheckUp Browser XSS Filter Lab
ProCheckUp's browser XSS filter lab for blog post.

![App](https://github.com/ProCheckUp/ProCheckUp_Browser_XSS_Filter_Lab/blob/master/showcase_image.png)

### Setup
##### Release
1. Download the release JAR here - [link to Release!](https://github.com/ProCheckUp/ProCheckUp_Browser_XSS_Filter_Lab/releases)
2. Either run the JAR or open a terminal and execute "java -jar local/path/ProCheckUpXSS-0.0.1.jar"
3. Access 127.0.0.1:8080 in your browser

##### Docker
1. git clone https://github.com/ProCheckUp/ProCheckUp_Browser_XSS_Filter_Lab.git
2. cd ProCheckUp_Browser_XSS_Filter_Lab
3. docker build -t pcu_xss .
4. docker run -d -p 8080:8080 -t pcu_xss
5. Access 127.0.0.1:8080 in your browser

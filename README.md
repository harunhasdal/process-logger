# process-logger

Opensource LiveCycle component for logging into server log from processes with using adobe logger implementation.

## Usage

Install the component using the Jar artifact to your livecycle server. If you don't know how to do that please check the Import your component section of the this [article](http://www.adobe.com/devnet/livecycle/articles/dsc_development.html).

Once you installed and started the component and can see it in your services view as well as define activity dialog.

===

![Define Activity](http://imagizer.imageshack.us/v2/640x480q90/22/g1pi.png)

===

![Configure Logger](http://imagizer.imageshack.us/v2/640x480q90/12/unmw.png)

===


## Building from source

To build this project you would need adobe-livecycle-client.jar client library from Adobe LiveCycle SDK.

Unfortunately the SDK cannot be distributed by third parties. You need to have LiveCycle Server or LiveCycle Workbench installation to get access to these libraries.

Once you locate the SDK directory ($SDK_DIR) use the following maven command to install the client jar into your local repository; so that it is available for the build. Do not forget to update the version for your SDK. Note that 


```
mvn org.apache.maven.plugins:maven-install-plugin:2.4:install-file \
  -DgroupId=com.adobe.livecycle \
  -DartifactId=adobe-livecycle-client \
  -Dversion=9.0.0.2 \
  -Dpackaging=jar \
  -Dfile=$SDK_DIR/client-libs/common/adobe-livecycle-client.jar
  
```

Once you updated pom.xml with the correct version for livecycle sdk, you can build the component with

`mvn package` or `mvn install`

## License


The MIT License (MIT)

Copyright (c) 2014 Harun Hasdal

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

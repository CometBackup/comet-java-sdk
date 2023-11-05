# comet-java-sdk

[![@CometBackup on Twitter](http://img.shields.io/badge/twitter-%40CometBackup-blue.svg?style=flat)](https://twitter.com/CometBackup)
![MIT License](https://img.shields.io/github/license/CometBackup/comet-go-sdk)


This project is the JAVA SDK and base client for the Comet Server API.


## Dependencies

The Comet Java SDK requires:
- JDK 11
- jackson-core 2.13.3
- jackson-databind 2.13.3

## Simple Usage Example
```java
import com.cometbackup.CometAPI;

public class AdminListUsers {
    public static void main(String[] args) throws Exception {
        var client = new CometAPI("http://127.0.0.1:8060", "admin", "admin");
        for (var user : client.AdminListUsers()) {
            System.out.println(user);
        }
    }
}
```

More demo code can be found in the `/demos` directory



## Getting Help

Bug reports and pull requests are welcome on GitHub at [https://github.com/CometBackup/comet-dotnet-sdk](https://github.com/CometBackup/comet-dotnet-sdk).

You may also submit issues via the ticket system at [cometbackup.com](https://cometbackup.com/).


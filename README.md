# steam

One of the Steam Web API methods returns a json document which details every supported method of the Steam Web API.  When finished, this library will transform that document into an idiomatic clojure client, which can be updated almost automatically.

Also on the roadmap: the as-yet unsupported [storefront api (http://wiki.teamfortress.com/wiki/User:RJackson/StorefrontAPI)

## How to run the tests

The project uses [Midje](https://github.com/marick/Midje/).

`lein midje` will run all tests.

`lein midje namespace.*` will run only tests beginning with "namespace.".

`lein midje :autotest` will run all the tests indefinitely. It sets up a
watcher on the code files. If they change, only the relevant tests will be
run again.

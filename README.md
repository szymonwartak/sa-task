
# SA task

A fun thing that Joe sent me.

# Usage

Scala language used. `sbt` build tool used to run the code/tests:
```shell
brew install sbt
sbt test
sbt 'run Data/example1.txt'
```

# Explanation

## Time complexity
n = num words; k = length of word

groupBy: uses HashMap, so for n elements it's O(n)

sorting letters for groupBy: O(k * log(k))

Overall runtime: O(n * k * log(k))

Details: One pass for groupBy. One pass for output. 
Solution was chosen for speed (above) and code readability.

## other notes

The FileNotFound exception is not caught/handled as it's a reasonable way to 
communicate the error at this stage.

# Possible extensions

The requirements are quite minimal, but given more time, I could package this application up to run on docker for 
easier portability. To allow for more widespread usage, running as a service would be useful too,
although this functionality wasn't requested at this stage.
Checking for illegal characters might be sensible too, but what is illegal is unknown at this stage.

I might also take a large corpus and test the solution at scale. 
But this is more for fun than being useful, as we know how the solution will scale with the complexity analysis.

# Contributors

Szymon Wartak
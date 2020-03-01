/* Chapter 9 List testing */
/* This section is for the overrides on immutable Sets, since Sets use hashCode to see if an object is a duplicate */
/* Notice that these overrides, are overriding the default function sets from the kotlin standard library.*/
/* ONLY CLASS DUCK 1 PRODUCES 1 SET, which is what outcome you want. The others are incorrect ways to produce a single set.*/

class Duck1 (val size1: Int = 17) {
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        if (other is Duck1 && size1 == other.size1) {
            return true
        }
        return false
    }

    override fun hashCode() = size1
}

class Duck2(val size2: Int = 17) { /* Even though size2 is not used, and is overridden in the main.kt portion, we are just using this as an example of a failed override.*/
    override fun equals (other: Any?) : Boolean {
        return false
    }

    override fun hashCode(): Int {
        return 7
    }
}

class Duck3 (val size3: Int = 17) { /*Even though size3 is not used, and it's overridden, we are just using this as an example of a failed override*/
     data class Duckdataclass (val size3: Int = 18)
}

class Duck4 (val size4: Int = 17) { /*Even though size4 is not used, and it's overridden in the main.kt portion, we are just using this as an example of a failed override*/
    override fun equals(other: Any?): Boolean {
        return true
    }

    override fun hashCode(): Int {
        return (Math.random() * 100).toInt()
    }
}
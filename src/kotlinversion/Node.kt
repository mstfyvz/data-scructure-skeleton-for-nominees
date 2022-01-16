package kotlinversion

class Node(var data: Int) {

    var following: Node? = null

    fun appendToEnd(data: Int) {
        val end = Node(data)
        var n: Node? = this
        while (n!!.following != null) {
            n = n.following
        }
        n.following = end
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    // For example:: --> 5 --> 6 --> 7 --> 3 --> .
    fun printNodes() {
        var n: Node? = this

        do {
            print(" --> ${n!!.data}")
            n = n.following
        } while (n != null)

        print(" --> .\n")
    }

    // TODO:: Implement to return the length of the SinglyLinkedList
    fun length(h: Node?): Int {
        var len = 0
        var n: Node? = h

        do {
            len++
            n = n!!.following
        } while (n != null)

        return len
    }

    // TODO:: Implement to return the sum of the Nodes
    fun sumOfNodes(): Int {
        var sum = 0
        var n: Node? = this

        do {
            sum += n!!.data
            n = n.following
        } while (n != null)

        return sum
    }

    fun deleteNode(head: Node, data: Int): Node? {
        var n: Node? = head

        // Mustafa AQ: It is not allowed to remove itself?
        // TODO:: Implement the proper loop in order to remove given data

        var found: Node? = null

        do {
            if (n?.following?.data == data) {
                found = n.following
                n.following = n.following?.following
            }
            n = n?.following
        } while (n != null)

        //
        return found
    }
}
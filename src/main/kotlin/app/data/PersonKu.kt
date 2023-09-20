package app.data

class PersonKu(val name: String){
    override fun hashCode(): Int {
        return name.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        when (other) {
            is PersonKu -> return name == other.name
            else -> return false
        }
    }

    override fun toString(): String {
        return "Person with name : $name"
    }
}
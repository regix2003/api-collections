package one.digitalinnovation.collections

class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T){
        map[id] = value// map.put(id, value) -> a IDE sugeriu uma mudança
    }

    fun remove(id: String) = map.remove(id)

    fun findById(id: String) = map[id]// fun findById(id: String) = map.get(id)

    fun findAll() = map.values

}
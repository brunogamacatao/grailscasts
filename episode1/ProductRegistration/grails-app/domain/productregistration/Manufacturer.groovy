package productregistration

class Manufacturer {
	String name
	String website
	String address
	
	static hasMany = [products : Product]

    static constraints = {
		name(blank: false)
		website(blank: false, url: true)
		address(blank: false)
    }
	
	String toString() {
		return name
	}
}

package productregistration

class Product {
	String name
	int quantity
	double price
	
	static belongsTo = [manufacturer : Manufacturer]
	
    static constraints = {
		name(blank: false)
		quantity(blank: false, min: 0)
		price(blank: false, min: 0.01d)
		manufacturer(blank: false)
    }
	
	String toString() {
		return name
	}
}

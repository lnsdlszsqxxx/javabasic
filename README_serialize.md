# SerializeAndDeserialize

## Definition
Serialization is a mechanism of converting the state of **an object** into a byte stream. Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. This mechanism is used **to persist the object**.

  
## How to do it
We need to implement the serializable interface to make the object serializable. Serializable is a **marker interface.** There is no method in the serializable interface.

  
## Some points
- After serialization, only the state fields will be stored and only instant fields will be serialized. Serialization doesn’t include method information.

- Associated objects must be implementing Serializable interface.

- For some sensitive information, such as password or SSN, that you don’t want to serialize, you can use **transient** key word, for example:
```
    private transient int ssn;
```

- writeObject/readObject: Encrypt/DeEncrypt
If you have to serialize some sensitive information, you can define _writeObject/readObject_ (these names are fixed) in your object class. Then encode/decode the sensitive information.

- SerialVersionUID: If we change the object class after serializing the instant object, we will get error (local class incompatible) when we try to deserialize it because the object fields don't match. In this case, we need to define the variable **serialVersionUID**. This stores the version information about the serialized file, so when deserialization the fields will match. This variable must be **static, final and of type long**.



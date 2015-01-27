#Command pattern
=
The Command Pattern
=
- Encapsulates a request as an object, thereby letting you parameterize other objects with different requests, queue or log requests and support undo-able operations.
- A Command object is at the center of decoupling and encapsulates a receiver with an action (or set actions)
- An invoker makes a request of a Command by calling its execute() method, which invokes those actions on the receiver
- Invokers can be parameterized with Commands, even dynamically at runtime
- Commands may support undo by implementing an undo method that restores the object to its previous state before the execute() method was last called
- Macro Commands are simple extension of Command that allow multiple commands to be invoked, Likewise, MacroCommands can easily support undo()
- In practice, it is not uncommon for "smart" Command Objects to implement the request themselves rather than delegating to a receiver
- Commands may also be used to implement logging and transactional systems
 

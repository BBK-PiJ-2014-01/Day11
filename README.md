Day11
=====
Exercise 1:
 - Comparator Class implemented - code complete

Exercise 2.1:
 - Class PhoneLauncher implemented with appropriate script building a nwe SmartPhone object.
 - code complete

Exercise 2.2:
 - myPhone upcasted to MobilePhone but it does not compile.
 BrowseWeb() and PlayGame() are unknown to Parent Class MobilePhone.
 - A possible solution would be to make MobilePhone an abstract Class with BrowseWeb() and PlayGame() as abstract methods.
 SmartPhone can then run an implementation of these two methods.
- Another possible solution is to downcast back to SmartPhone (code implemented in Class PhoneLauncher)

Exercise 2.3:
 - It can only call method call().

Exercise 2.4:
 - Object in testPhone() downcasted to SmartPhone. All SmartPhone methods now work.
 - Code complete.

Exercise 2.5:
 - if passing on a MobilePhone object to method testPhone, it compiles but fails at run time.
(it cannot downcast a phone to MobilePhone as it is not one).

Exercise 3:
 - Generic DoublyLinkedList Class & Company Class implemented - code complete
# A-Hybrid-Cloud-Approach-for-Secure-Authorized-Deduplication-
To avoid an entry of duplicated data in the cloud storage medium. 
Abstract
      while improving storage and bandwidth efficiency, is incompatible with traditional encryption. Specifically,traditional encryption requires different users to encrypt their data with their own keys. Thus, identical data copies of different users will lead to different ciphertexts, making deduplication impossible. Convergent encryption provides a viable option to enforce data confidentiality while realizing deduplication.It encrypts/decrypts a data copy with a convergent key,which is derived by computing the cryptographic hashvalue of the content of the data copy itself . After key generation and data encryption, users retain the keys and send the ciphertext to the cloud. Since encryption is deterministic, identical data copies will generate the same convergent key and the same ciphertext.
           MODULE DESCRIPTION
Admin:
	Admin provides personal detail to registration. After registration admin can login into the page. It checks the user name and password. If it is correct admin can enter into it. Otherwise admin should reenter his password. After this process admin can choose the file and also encrypt it. Admin sends the encrypted file to the server. And also save the file in server.

Private Cloud:
	The private cloud is involved as a proxy to allow data owner/users to securely perform duplicate check with differential privileges. Compared with the traditional deduplication architecture in cloud computing, this is a new entity introduced for facilitating user’s secure usage of cloud service. Specifically, since the computing resources at data user/owner side are restricted and the public cloud is not fully trusted in practice, private cloud is able to provide data user/owner with an execution environment and infrastructure working as an interface between user and the public cloud. The private keys for the privileges are managed by the private cloud, who answers the file token requests from the users. The interface offered by the private cloud allows user to submit files and queries to be securely stored and computed respectively.

Public Cloud:
	The data owners only outsource their data storage by utilizing public cloud while the data operation is managed in private cloud. A new deduplication system supporting differential duplicate checkis proposed under this hybrid cloud architecture where the S-CSP resides in the public cloud. The user is only allowed to perform the duplicate check for files marked with the corresponding privileges. This is an entity that provides a data storage service in public cloud. The S-CSP provides the data outsourcing service and stores data on behalf of the users. To reduce the storage cost, the S-CSP eliminates the storage of redundant data via deduplication and keeps only unique data.

User:
	A user derives a convergent key from each original data copy and encrypts the data copy with the convergent key. In addition, the 
user also derives a tag for the data copy, such that the tag will be used to detect duplicates. Here, we assume that the tag correctness property holds, i.e., if two data copies are the same, then their tags are the same. To detect duplicates, the user first sends the tag to the server side to check if the identical copy has been already stored. Note that both the convergent key and the tag are independently derived and the tag cannot be used to deduce the convergent key and compromise data confidentiality. Both the encrypted data copy and its corresponding tag will be stored on the server side.

 




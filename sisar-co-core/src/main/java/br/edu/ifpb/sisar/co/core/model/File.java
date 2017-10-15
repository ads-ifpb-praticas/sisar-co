
package br.edu.ifpb.sisar.co.core.model;

/**
 *
 * @author miolivc
 * @mail miolivc@outlook.com
 * @since 15/10/2017
 */

public abstract class File {
    
    private String name;
    private UserAccount owner;

    public File() {
    }

    public File(String name, UserAccount owner) {
        this.name = name;
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserAccount getOwner() {
        return owner;
    }

    public void setOwner(UserAccount owner) {
        this.owner = owner;
    }
    
    public abstract boolean isLeaf();
    
}


<!-- toc --> 
# How to Change Root Password and Add a User to the `sudoers` Group
## 1. Changing the Root Password

If you need to change the root password, follow these steps:

### **Step-by-Step Guide**:

1. **Log in as Root**:
    - If you already know the root password, log in as the root user using:
      ```bash
      su -
      ```

    - If you don’t know the root password, you can boot into **single-user mode** (Recovery mode) to reset it:
        - Restart the system.
        - At the GRUB menu, press `e` to edit the boot options.
        - Find the line starting with `linux` and replace `ro` with `rw`, and add `init=/bin/bash` at the end of the line.
        - Press `Ctrl + X` or `F10` to boot.
        - You’ll be dropped into a root shell.

2. **Reset the Root Password**:
    - Once you are logged in as root or have access to a root shell, run the following command to change the root password:
      ```bash
      passwd
      ```
    - You will be prompted to enter a new password for the root account and confirm it.

3. **Reboot**:
    - After changing the password, type `reboot` to restart the system normally.

---

## 2. Adding a User to the `sudoers` Group

To give a user administrative (sudo) privileges, follow these steps:

### **Step-by-Step Guide**:

1. **Log in as Root**:
    - You need root access to add a user to the `sudoers` group. You can either:
        - Log in directly as root:
          ```bash
          su -
          ```
        - Or use `sudo` if you are already in the `sudo` group:
          ```bash
          sudo su -
          ```

2. **Add User to Sudo Group**:
    - To add a user to the `sudo` group, run the following command:
      ```bash
      usermod -aG sudo username
      ```
    - Replace `username` with the actual username you want to grant `sudo` access to.

3. **Verify Group Membership**:
    - To check if the user has been added to the `sudo` group, use:
      ```bash
      groups username
      ```
    - The output should show `sudo` in the list of groups.

4. **Test `sudo` Access**:
    - Log in as the user and test sudo privileges by running:
      ```bash
      sudo whoami
      ```
    - If successful, this will output `root`.

---

### Notes:
- If you encounter the error `user is not in the sudoers file`, this means the user does not have `sudo` privileges and must be added using the steps above.
- You can also edit the `/etc/sudoers` file manually to give users `sudo` privileges, but it's safer to add them to the `sudo` group.


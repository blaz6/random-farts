package dev.klemencicblazz.random_farts;

import dev.klemencicblazz.random_farts.Commands.HelloCommand;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.PluginLoadOrder;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.permission.ChildPermission;
import org.bukkit.plugin.java.annotation.permission.Permission;
import org.bukkit.plugin.java.annotation.plugin.*;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

@Plugin(name = "random-farts", version = "0.0.1")
@Description("A test plugin")
@LoadOrder(PluginLoadOrder.POSTWORLD)
@Author("klemencicblazz")
@Commands(@Command(name = "hello", desc = "hello command", permission = "test.foo", permissionMessage = "You do not have permission!", usage = "/<command>"))
@Permission(name = "test.foo", desc = "Allows foo command", defaultValue = PermissionDefault.OP)
@Permission(name = "test.*", desc = "Wildcard permission", defaultValue = PermissionDefault.OP, children = { @ChildPermission(name ="test.foo") })
@ApiVersion(ApiVersion.Target.v1_20)

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        this.getLogger().info("Starting...");
        this.getCommand("hello").setExecutor(new HelloCommand());
    }

    @Override
    public void onDisable() {
        this.getLogger().info("Goodbye!");
    }
}
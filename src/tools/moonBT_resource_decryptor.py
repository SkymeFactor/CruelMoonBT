import os, sys
import numpy as np

def read_data(filename: str) -> bytearray:
    data = bytearray()
    with open(filename, "rb") as file:
        data = file.read()
    return data


def save_data(data: bytearray, filename: str) -> None:
    with open(filename, "wb") as file:
        file.write(data)


def decode_data_method_a(encrypted_data: bytearray, salt: int) -> bytearray:
    decrypted_data = bytearray()

    for bite in encrypted_data:
        decrypted_data.append(np.array(bite ^ salt, dtype=np.uint8))
        salt += 1
        if salt > 255:
            salt = 0

    return decrypted_data

def decode_data_method_b(encrypted_data: bytearray, salt: int) -> bytearray:
    decrypted_data = bytearray()
    salt = encrypted_data[2] - 3

    for bite in encrypted_data[3:]:
        decrypted_data.append(np.array(bite ^ salt, dtype=np.uint8))
        salt += 1

    return decrypted_data


def main() -> None:
    filename = sys.argv[1]
    folder = "decrypted"
    salt = 100 # -1 for some files
    if not os.path.isdir(folder):
        os.mkdir(folder)
    
    data = read_data(filename)
    #data = decode_data_method_a(data, salt) # Is used when it's twice decrypted
    save_data(decode_data_method_a(data, salt), os.path.join(folder, os.path.basename(filename)))


if __name__ == "__main__":
    main()

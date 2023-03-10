import React from 'react';
import axios from "axios";

export default function AddBike() {

    const [bikeName, setBikeName] = React.useState<string>("");

    function sendBikeToBackend() {
        axios.post("/api/bike-to-add", {
            name: bikeName
        }).then(response => {
            console.log(response);
        }).catch(error => {
            console.log(error);
        });
        }

    function handleSubmit(event: React.FormEvent<HTMLFormElement>) {
        event.preventDefault();
        sendBikeToBackend();
    }

    function onChangeHandler(event: React.ChangeEvent<HTMLInputElement>) {
        setBikeName(event.target.value);
    }

    return (
        <div>
            <form onSubmit={handleSubmit}>
                <input value={bikeName} type="text" placeholder={"Enter the Name of the Bike"} onChange={onChangeHandler}/>
                <button>Send</button>
            </form>
        </div>
    );
}